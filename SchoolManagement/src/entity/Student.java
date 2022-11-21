package entity;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    public Student(String name, Date dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    private String name;
    private Date dob;
    private String address;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                '}';
    }
}
