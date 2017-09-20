package com.example.quangphannhat.myfirstapplication;

/**
 * Created by quang.phannhat on 20/09/2017.
 */

public class DataModel {

    public String name;
    public int price;
    public int imageID;

    public DataModel(String name, int price, int imageID ) {
        this.name=name;
        this.price=price;
        this.imageID=imageID;

    }

    public String getName() {
        return name;
    }



}