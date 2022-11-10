package entity;

import java.util.Scanner;

public class Route implements InfoInput{
    private static int AUTO_ROUTE_ID = 100;
    private int routeId;
    private double distance;
    private int stopPointNumber;



    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
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
                "routeId=" + routeId +
                ", distance=" + distance +
                ", stopPointNumber=" + stopPointNumber +
                '}';
    }

    public void infoInput() {
        this.routeId = AUTO_ROUTE_ID;
        AUTO_ROUTE_ID++;
        System.out.println("Nhập vào khoảng cách tuyến: ");
        this.distance = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào số điểm dừng: ");
        this.stopPointNumber = new Scanner(System.in).nextInt();
    }
}
    