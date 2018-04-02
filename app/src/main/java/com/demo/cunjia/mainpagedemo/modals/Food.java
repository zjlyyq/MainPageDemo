package com.demo.cunjia.mainpagedemo.modals;

import android.graphics.Bitmap;

public class Food {
    String food_name;
    float food_price;
    Bitmap food_picture;
    int food_comments_count;
    int food_favors;

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public float getFood_price() {
        return food_price;
    }

    public void setFood_price(float food_price) {
        this.food_price = food_price;
    }

    public Bitmap getFood_picture() {
        return food_picture;
    }

    public void setFood_picture(Bitmap food_picture) {
        this.food_picture = food_picture;
    }

    public int getFood_comments_count() {
        return food_comments_count;
    }

    public void setFood_comments_count(int food_comments_count) {
        this.food_comments_count = food_comments_count;
    }

    public int getFood_favors() {
        return food_favors;
    }

    public void setFood_favors(int food_favors) {
        this.food_favors = food_favors;
    }
}
