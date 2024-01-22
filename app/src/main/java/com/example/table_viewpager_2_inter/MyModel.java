package com.example.table_viewpager_2_inter;

public class MyModel {
    private int imageResId; // ID de recurso de la imagen
    private String text;

    // Constructor
    public MyModel(int imageResId, String text) {
        this.imageResId = imageResId;
        this.text = text;
    }

    // Getters y Setters
    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
