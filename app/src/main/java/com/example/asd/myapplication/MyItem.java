package com.example.asd.myapplication;


class MyItem {
    int image;
    String text1;
    String text2;
    String price;
    String name;

    MyItem( int image, String text1, String text2, String price, String name) {
        this.text1 = text1;
        this.text2 = text2;
        this.price = price;
        this.name = name;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "image=" + image +
                ", text1='" + text1 + '\'' +
                ", text2='" + text2 + '\'' +
                ", price='" + price + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
