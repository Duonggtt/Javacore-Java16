package DEMO_ChuViDienTich;

public class Rectangle implements Polygon{

    private double length = 4;
    private double width = 4;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void display() {
        calArea();
    }

    @Override
    public void calArea() {
        System.out.println("Dien tich = " + (width * length));
    }
}
