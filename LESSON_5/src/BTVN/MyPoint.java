package BTVN;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {

    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public MyPoint(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(double x) {
        return x;
    }

    public double getY(double y) {
        return y;
    }

    public double distance(MyPoint secondPoint) {
        return Math.sqrt(Math.pow((secondPoint.x - this.x),2) + Math.pow((secondPoint.y - this.y) ,2));
    }

    public double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
    }


}
