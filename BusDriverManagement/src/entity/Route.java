package entity;

public class Route {
    private int id;
    private double distance;
    private int stopPointNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getStopPointNumber() {
        return stopPointNumber;
    }

    public void setStopPointNumber(int stopPointNumber) {
        this.stopPointNumber = stopPointNumber;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", distance=" + distance +
                ", stopPointNumber=" + stopPointNumber +
                '}';
    }
}
