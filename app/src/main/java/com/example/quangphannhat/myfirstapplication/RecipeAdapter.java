package com.example.quangphannhat.myfirstapplication;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



/**
 * Created by quang.phannhat on 19/09/2017.
 */

public class RecipeAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Recipe> mDataSource;


    public RecipeAdapter(Context context, ArrayList<Recipe> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return mDataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
       // View rowView = mInflater.inflate(R.layout.list_item_recipe, viewGroup, false);

        Recipe recipe = (Recipe) getItem(i);
        // Lookup view for data population
/*
        TextView txName = (TextView) rowView.findViewById(R.id.textView6);

        TextView tvPrice = (TextView) rowView.findViewById(R.id.textView5);

        TextView tvNumber = (TextView) rowView.findViewById(R.id.textView7);

        ImageView thumbnailImageView = (ImageView) rowView.findViewById(R.id.imageView3);
        // Populate the data into the template view using the data object
        txName.setText(recipe.name);
        tvPrice.setText(String.valueOf(recipe.price));
        tvNumber.setText(String.valueOf(recipe.number));
        // Return the completed view to render on screen

        thumbnailImageView.setImageResource(recipe.imageID);
        //thumbnailImageView.setImageBitmap(BitmapFactory.decodeFile(recipe.image));

        return rowView;
        */
        ViewHolder holder;

// 1
        if(convertView == null) {

            // 2
            convertView = mInflater.inflate(R.layout.list_item_recipe, viewGroup, false);

            // 3
            holder = new ViewHolder();
            holder.holder_thumbnailImageView = (ImageView) convertView.findViewById(R.id.imageView3);
            holder.holder_name = (TextView) convertView.findViewById(R.id.textView6);
            holder.holder_price = (TextView) convertView.findViewById(R.id.textView5);
            holder.holder_minus = (Button)  convertView.findViewById(R.id.button3);

            // 4
            convertView.setTag(holder);
        }
        else{
            // 5
            holder = (ViewHolder) convertView.getTag();
        }
        holder.holder_thumbnailImageView.setImageResource(recipe.imageID);
        holder.holder_name.setText(recipe.name);
        holder.holder_price.setText(String.valueOf(recipe.price));
       // holder.holder_add.setTag(i);
       // holder.holder_minus.setTag(i);

        return convertView;
    }
    private static class ViewHolder {
        public TextView holder_name;
        public TextView holder_price;
        public ImageView holder_thumbnailImageView;
        public Button holder_add;
        public Button holder_minus;

    }


}
