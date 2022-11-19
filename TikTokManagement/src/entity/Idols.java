package entity;

import java.util.ArrayList;

public class Idols {

    private int id;
    private String name;
    private String email;
    private String group;
    private ArrayList<Followers> followers;

    public Idols(int id, String name, String email, String group, ArrayList<Followers> followers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.group = group;
        this.followers = followers;
    }

    public Idols() {

    }

    public ArrayList<Followers> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Followers> followers) {
        this.followers = followers;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idols{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                ", followers=" + followers +
                '}';
    }
}
