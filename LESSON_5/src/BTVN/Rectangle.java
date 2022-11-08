package BTVN;

public class Rectangle {
    public double width;
    public double height;
    public String color;

    public Rectangle() {
        double width = 1;
        double height = 1;
        String color = "red";
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

    }

    public String getColor() {
        return color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return (width + height) * 2;
    }

    public void Xuat() {
        System.out.println("Cac thuoc tinh hinh chu nhat da tao: \nWidth = " + getWidth() + "\nHeight = " + getHeight() + "\nColor = " + getColor() + "\nPerimeter = " + findPerimeter() + "\nArea = " + findArea());

    }
}

