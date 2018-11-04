package com.trailbuddy.trailbuddy.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trailbuddy.trailbuddy.R;
import com.trailbuddy.trailbuddy.ui.TrailListFragment.OnListFragmentInteractionListener;
import com.trailbuddy.trailbuddy.data.TrailListData.TrailListItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link TrailListItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class TrailListRecyclerViewAdapter extends RecyclerView.Adapter<TrailListRecyclerViewAdapter.ViewHolder> {

    private final List<TrailListItem> mTrailListItems;
    private final OnListFragmentInteractionListener mListener;

    public TrailListRecyclerViewAdapter(List<TrailListItem> items, OnListFragmentInteractionListener listener) {
        mTrailListItems = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_traillist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mTrailListItems.get(position);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTrailListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public TrailListItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.item_number);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
