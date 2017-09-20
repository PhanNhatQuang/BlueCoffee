package com.example.quangphannhat.myfirstapplication;

import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by quang.phannhat on 19/09/2017.
 */

public class Recipe {
    public String name;
    public int price;
    public String image;
    public int imageID;
    public int number;
    public Recipe()
    {
        number = 0;
    }
    public static ArrayList<Recipe> getListRecipe()
    {
        ArrayList<Recipe> listRecipe = new ArrayList<Recipe>();
        for(int i = 0; i <= 10; i++)
        {
            Recipe temp = new Recipe();
            temp.name = "CAFE" + String.valueOf(i);
            temp.price = 9000;
            temp.image ="/sdcard/DCIM/100ANDRO/DSC_0003.jpg";
            temp.imageID = R.drawable.caphe;
            listRecipe.add(temp);
        }
        return listRecipe;
    }
}
