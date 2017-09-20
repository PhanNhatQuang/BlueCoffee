package com.example.quangphannhat.myfirstapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost); // initiate TabHost
        TabHost.TabSpec spec; // Reusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab

        spec = tabHost.newTabSpec("order"); // Create a new TabSpec using tab host
        spec.setIndicator("ORDER"); // set the “ORDER” as an indicator
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent(this, Order.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Pay"); // Create a new TabSpec using tab host
        spec.setIndicator("PAY"); // set the “PAY” as an indicator
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent(this, Pay.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                // display the name of the tab whenever a tab is changed
                Toast.makeText(getApplicationContext(), tabId, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
