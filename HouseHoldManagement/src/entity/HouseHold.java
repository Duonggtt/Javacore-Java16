package entity;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseHold{

    private int id;
    private String houseNumber;
    private ArrayList<Member> members;

    public HouseHold(int id, String houseNumber, ArrayList<Member> members) {

        this.id = id;
        this.houseNumber = houseNumber;
        this.members = members;
    }

    public HouseHold() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "HouseHold{" +
                "id=" + id +
                ", houseNumber='" + houseNumber + '\'' +
                ", members=" + members +
                '}';
    }


}
