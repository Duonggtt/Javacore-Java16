package BTVN;

public class MyPoint {
    public double x;
    public double y;

    public MyPoint() {

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

    public double gety(double y) {
        return y;
    }

    public double distance(MyPoint p, double secondPoint) {
        return Math.sqrt(Math.pow(secondPoint,2) + Math.pow(p.x,2));
    }

    public double distance(double p1, double p2) {
        return Math.sqrt(Math.pow(p1,2) + Math.pow(p2,2));
    }


}
