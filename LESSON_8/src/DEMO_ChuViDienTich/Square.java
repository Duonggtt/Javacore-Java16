package DEMO_ChuViDienTich;

public class Square implements Polygon{

    private double side = 2;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void display() {
        calArea();
    }

    @Override
    public void calArea() {
        System.out.println("Dien tich = " + (side * side));
    }
}
