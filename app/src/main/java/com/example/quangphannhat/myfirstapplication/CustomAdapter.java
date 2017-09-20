package com.example.quangphannhat.myfirstapplication;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quangphannhat.myfirstapplication.DataModel;
import com.example.quangphannhat.myfirstapplication.R;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<DataModel> implements View.OnClickListener{

    private ArrayList<DataModel> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        TextView txtPrice;
        ImageView btnadd;
        ImageView mImage;
    }

    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.row_item, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        DataModel dataModel=(DataModel)object;

        switch (v.getId())
        {
            case R.id.item_add:
                Snackbar.make(v, "Release date " +dataModel.price, Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        DataModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.row_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.txtName);
            viewHolder.txtPrice = (TextView) convertView.findViewById(R.id.txtPrice);
            viewHolder.btnadd = (ImageView) convertView.findViewById(R.id.item_add);
            viewHolder.mImage = (ImageView) convertView.findViewById(R.id.mImage);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }


        lastPosition = position;

        viewHolder.txtName.setText(dataModel.getName());
        viewHolder.txtPrice.setText(String.valueOf(dataModel.price));
        viewHolder.btnadd.setOnClickListener(this);
        viewHolder.btnadd.setTag(position);
        viewHolder.mImage.setImageResource(R.drawable.caphe);
        // Return the completed view to render on screen
        return convertView;
    }
}