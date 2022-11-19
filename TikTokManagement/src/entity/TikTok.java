package entity;

import java.util.ArrayList;

public class TikTok {

    private ArrayList<Idols> idols;
    private ArrayList<Songs> songs;

    public TikTok(ArrayList<Idols> idols, ArrayList<Songs> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    public TikTok() {

    }

    public ArrayList<Idols> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idols> idols) {
        this.idols = idols;
    }

    public ArrayList<Songs> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Songs> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "TikTok{" +
                "idols=" + idols +
                ", songs=" + songs +
                '}';
    }
}
