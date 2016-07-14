package edu.hm.cs.vadere.seating.datacollection;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import edu.hm.cs.vadere.seating.datacollection.model.Seat;

// 4 Vierer
public class FloorRectAdapter extends BaseAdapter {
    private final static int FLOOR_RECT_COUNT = 20;
    private final Context context;
    private final List<View> views;

    public FloorRectAdapter(Context c) {
        context = c;

        // Add seats row-wise
        views = new ArrayList<>(FLOOR_RECT_COUNT);
        for (int i = 0, seatNumber = 1; i < FLOOR_RECT_COUNT; i++) {
            if ((i - 2) % 5 == 0) { // 2, 7, 12, 17
                // Placeholder
                views.add(new PlaceholderWidget(context));
            } else {
                Seat seat = new Seat(seatNumber++);
                views.add(new SeatWidget(seat, context));
            }
        }
    }

    @Override
    public int getCount() {
        return FLOOR_RECT_COUNT;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return views.get(position);
    }
}