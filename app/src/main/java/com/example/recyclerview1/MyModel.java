package com.example.recyclerview1;

public class MyModel {
    private int image;
    private String name;
    private String time;
    private String message;

    public MyModel(int image, String name, String time, String message) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }
}
