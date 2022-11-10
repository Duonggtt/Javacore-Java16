package entity;

public class Bus_ManagementDetail {

    private Route route;
    private int stopPointQuantity;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getStopPointQuantity() {
        return stopPointQuantity;
    }

    public void setStopPointQuantity(int stopPointQuantity) {
        this.stopPointQuantity = stopPointQuantity;
    }

    @Override
    public String toString() {
        return "Bus_ManagementDetail{" +
                "route=" + route +
                ", stopPointQuantity=" + stopPointQuantity +
                '}';
    }
}
