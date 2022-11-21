package entity;

import java.util.ArrayList;

public class Clazz {
    public Clazz(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    private String name;
    private ArrayList<Student> students;

    public Clazz() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
