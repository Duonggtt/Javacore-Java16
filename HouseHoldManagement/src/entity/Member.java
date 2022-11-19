package entity;

import java.util.Date;
import java.util.Scanner;

public class Member {

    private String name;
    private Date dob;
    private String job;

    public Member(String name, Date dob, String job) {
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    public Member() {

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }

}
