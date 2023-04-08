package com.example.shoppinglist;

import java.io.Serializable;
import java.util.Comparator;

public class Product implements Serializable {
    protected String name, info, id;


    public Product (String name, String info){
        this.name = name;
        this.info = info;
        id = String.valueOf((int)(Math.random()*90000));
    }




    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setId(String id) {
        this.id = id;
    }
}
