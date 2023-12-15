package oop1.ex;

public class Rectangle {
    private int width;
    private int height;
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getArea() {
        return width * height;
    }
    public int getPerimeter() {
        return (2 * width + 2 * height);
    }
    public boolean isSquare() {
        return width == height;
    }
}
