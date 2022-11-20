package entity;

import java.util.ArrayList;

public class Clazz {

    private String subject;
    private ArrayList<Student> students;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
