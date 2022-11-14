package entity;

public class TranscriptDetail {

    private Subject subject;
    private double point;

    public TranscriptDetail(Subject subject, float point) {
        this.subject = subject;
        this.point = point;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "TranscriptDetail{" +
                "subject=" + subject +
                ", point=" + point +
                '}';
    }
}
