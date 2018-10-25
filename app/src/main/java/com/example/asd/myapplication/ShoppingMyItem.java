package com.example.asd.myapplication;

public class ShoppingMyItem {
    int image;
    String name;
    int count;
    String price;
    String text;

    ShoppingMyItem( int image, String name,  int count ,String price, String text) {
        this.image = image;
        this.name = name;
        this.count = count;
        this.price = price;
        this.text = text;

    }

    @Override
    public String toString() {
        return "ShoppingMyItem{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price='" + price + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
