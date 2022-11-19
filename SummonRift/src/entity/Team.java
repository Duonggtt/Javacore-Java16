package entity;

import java.util.ArrayList;

public class Team {

    private int id;
    ArrayList<Figure> figures;

    public Team(int id, ArrayList<Figure> figures) {
        this.id = id;
        this.figures = figures;
    }

    public Team() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", figures=" + figures +
                '}';
    }
}
