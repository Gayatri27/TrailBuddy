package com.trailbuddy.trailbuddy.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.trailbuddy.trailbuddy.R;
import com.trailbuddy.trailbuddy.ui.TrailListFragment.OnListFragmentInteractionListener;
import com.trailbuddy.trailbuddy.data.TrailListData;

public class MainActivity extends AppCompatActivity implements OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(TrailListData.TrailListItem item) {

    }
}
