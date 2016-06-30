package com.example.vishal.phonesicalcapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALiBH on 6/30/2016.
 */
public class ContactArrayAdapter extends ArrayAdapter<PhoneDB> {

    //private List<PhoneDB> list = new ArrayList<PhoneDB>();

    public ContactArrayAdapter(Context context,List<PhoneDB> db) {
        super(context,0, db);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }


    @Override
    public void add(PhoneDB object) {
        super.add(object);
    }

    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        final PhoneDB con = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.display, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.text);
       // TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
        // Populate the data into the template view using the data object
        tvName.setText(con.f_name);
        //tvHome.setText(user.hometown);
        // Return the completed view to render on screen
        Button deletebtn = (Button) convertView.findViewById(R.id.but);
        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con.delete();
                notifyDataSetChanged();
            }
        });
        return convertView;
    }

    @Override
    public PhoneDB getItem(int position) {
        return super.getItem(position);
    }
}
