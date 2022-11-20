package entity;

import java.util.ArrayList;

public class Center {

    private String manager;
    private String teacher;
    private Clazz clazz;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Center{" +
                "manager='" + manager + '\'' +
                ", teacher='" + teacher + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
