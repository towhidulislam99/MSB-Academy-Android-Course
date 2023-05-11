package com.example.recyclerview;

public class FoodModel {

    String foodname;
    String fooddesc;
    int image;

    public FoodModel(String foodname, String fooddesc, int image) {
        this.foodname = foodname;
        this.fooddesc = fooddesc;
        this.image = image;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getFooddesc() {
        return fooddesc;
    }

    public void setFooddesc(String fooddesc) {
        this.fooddesc = fooddesc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
