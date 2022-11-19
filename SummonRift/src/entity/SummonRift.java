package entity;

import java.util.ArrayList;

public class SummonRift {

    ArrayList<Team> teams;

    public SummonRift(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public SummonRift() {
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "teams=" + teams +
                '}';
    }
}
