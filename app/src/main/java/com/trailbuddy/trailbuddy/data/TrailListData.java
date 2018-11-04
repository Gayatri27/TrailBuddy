package com.trailbuddy.trailbuddy.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class TrailListData {

    public static final List<TrailListItem> ITEMS = new ArrayList<TrailListItem>();

    public static void addItem(TrailListItem item) {
        ITEMS.add(item);
    }

    public static class TrailListItem {

        private int id;
        private String name;
        private String description;
        private String duration;
        private String intensity;
        private BigDecimal length_miles;

        public TrailListItem(int id,String name, String description, String duration, String intensity, BigDecimal length_miles) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.duration = duration;
            this.intensity = intensity;
            this.length_miles = length_miles;
        }
    }
}
