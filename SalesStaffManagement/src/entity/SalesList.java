package entity;

import java.util.Arrays;

public class SalesList {

    private Staff staff;
    SalesListDetail[] salesListDetails;


    public SalesList(Staff staff, SalesListDetail[] salesListDetails) {
        this.staff = staff;
        this.salesListDetails = salesListDetails;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public SalesListDetail[] getSalesListDetails() {
        return salesListDetails;
    }

    public void setSalesListDetails(SalesListDetail[] salesListDetails) {
        this.salesListDetails = salesListDetails;
    }

    @Override
    public String toString() {
        return "SalesList{" +
                "staff=" + staff +
                ", salesListDetails=" + Arrays.toString(salesListDetails) +
                '}';
    }
}
