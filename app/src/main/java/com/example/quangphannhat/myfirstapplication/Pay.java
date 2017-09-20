package com.example.quangphannhat.myfirstapplication;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Pay extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        listView=(ListView)findViewById(R.id.list);

        dataModels= new ArrayList<>();

        dataModels.add(new DataModel("Apple Pie", 10000, R.drawable.caphe));
        dataModels.add(new DataModel("Banana Bread", 9000, R.drawable.caphe));
        dataModels.add(new DataModel("Cupcake", 15000, R.drawable.caphe));
        dataModels.add(new DataModel("Donut", 15000, R.drawable.caphe));
        dataModels.add(new DataModel("Eclair", 8000, R.drawable.caphe));
        dataModels.add(new DataModel("Froyo", 10000, R.drawable.caphe));
        dataModels.add(new DataModel("Gingerbread", 8000, R.drawable.caphe));
        dataModels.add(new DataModel("Honeycomb", 13000, R.drawable.caphe));
        dataModels.add(new DataModel("Ice Cream Sandwich", 9000, R.drawable.caphe));
        dataModels.add(new DataModel("Jelly Bean", 15000, R.drawable.caphe));
        dataModels.add(new DataModel("Kitkat", 17000, R.drawable.caphe));
        dataModels.add(new DataModel("Lollipop", 10000, R.drawable.caphe));
        dataModels.add(new DataModel("Marshmallow", 20000, R.drawable.caphe));


        adapter= new CustomAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DataModel dataModel= dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.name, Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
            }
        });
    }
}
