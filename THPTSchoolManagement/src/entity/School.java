package entity;

import java.util.ArrayList;

public class School {

    private String course;
    private int semester;
    ArrayList<Clazz> clazzes;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ArrayList<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(ArrayList<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    @Override
    public String toString() {
        return "School{" +
                "course='" + course + '\'' +
                ", semester=" + semester +
                ", clazzes=" + clazzes +
                '}';
    }
}
