package models;

public class Rectangle {
    private int height;

    public Rectangle(int height, int width) {
        height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return 0;
    }

    public int getLength() {
        return 0;
    }

    public boolean isSquare() {
        int width = 0;
        return height == width;
    }


}