package com.master.info_ua.videoannottool.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.master.info_ua.videoannottool.util.Categorie;

import java.util.List;

public class SpinnerAdapter extends ArrayAdapter<Categorie> {

    private List<Categorie> categories;

    public SpinnerAdapter(Context context, int resource, List<Categorie> categories) {
        super(context, resource, 0, categories);

        this.categories = categories;

    }
    @Override
    public boolean isEnabled(int position) {
        if (position == 0) {
            // Disable the first item from Spinner
            // First item will be use for hint
            return false;
        } else {
            return true;
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // I created a dynamic TextView here, but you can reference your own  custom layout for each spinner item
        TextView label = (TextView) super.getView(position, convertView, parent);
        //label.setTextColor(Color.BLACK);
        label.setText(categories.get(position).getName());
        // And finally return your dynamic (or custom) view for each spinner item
        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        /*
        View view = super.getDropDownView(position, convertView, parent);

        TextView tv = (TextView) view;
        tv.setText(categories.get(position).getName());
        if (position == 0) {
            // Set the hint text color gray
            tv.setTextColor(Color.GRAY);
        } else {
            tv.setTextColor(Color.BLACK);
        }
        */

        TextView label = (TextView) super.getDropDownView(position, convertView, parent);
        label.setText(categories.get(position).getName());
        if (position == 0) {
            // Set the hint text color gray
            label.setTextColor(Color.GRAY);
        } else {
            label.setTextColor(Color.BLACK);
        }
        return label;
    }

}
