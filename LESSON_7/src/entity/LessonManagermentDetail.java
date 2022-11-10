package entity;

public class LessonManagermentDetail {

    private Subject subject;
    private int clazzNumber;

    public LessonManagermentDetail(Subject subject, int clazzNumber) {
        this.subject = subject;
        this.clazzNumber = clazzNumber;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getClazzNumber() {
        return clazzNumber;
    }

    public void setClazzNumber(int clazzNumber) {
        this.clazzNumber = clazzNumber;
    }

    @Override
    public String toString() {
        return "LessonManagermentDetail{" +
                "subject=" + subject +
                ", clazzNumber=" + clazzNumber +
                '}';
    }
}
