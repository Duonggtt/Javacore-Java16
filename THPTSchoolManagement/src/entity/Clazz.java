package entity;

import java.util.ArrayList;

public class Clazz {

    ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "students=" + students +
                '}';
    }
}
