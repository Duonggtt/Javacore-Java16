package entity;

import java.util.ArrayList;

public class Followers {

    private int id;
    private String name;
    private String email;
    private int numberOfLike;

    public Followers(int id, String name, String email, int numberOfLike) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public Followers() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }


    @Override
    public String toString() {
        return "Followers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
