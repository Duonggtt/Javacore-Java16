package entity;

import java.util.Arrays;

public class Bus_Managerment {

    private Driver driver;
    private Bus_ManagementDetail[] bus_managementDetails;


    public Bus_Managerment(Driver driver, Bus_ManagementDetail[] bus_managementDetails) {
        this.driver = driver;
        this.bus_managementDetails = bus_managementDetails;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Bus_ManagementDetail[] getBus_managementDetails() {
        return bus_managementDetails;
    }

    public void setBus_managementDetails(Bus_ManagementDetail[] bus_managementDetails) {
        this.bus_managementDetails = bus_managementDetails;
    }

    @Override
    public String toString() {
        return "Bus_Managerment{" +
                "driver=" + driver +
                ", bus_managementDetails=" + Arrays.toString(bus_managementDetails) +
                '}';
    }
}
