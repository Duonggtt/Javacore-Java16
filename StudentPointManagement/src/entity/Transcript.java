package entity;

import java.util.Arrays;

public class Transcript {

    private Student student;
    private TranscriptDetail[] transcriptDetails;

    public double totalPoint;

    public Transcript() {

    }

    public double getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(double totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Transcript(Student student, TranscriptDetail[] transcriptDetails) {
        this.student = student;
        this.transcriptDetails = transcriptDetails;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public TranscriptDetail[] getTranscriptDetails() {
        return transcriptDetails;
    }

    public void setTranscriptDetails(TranscriptDetail[] transcriptDetails) {
        this.transcriptDetails = transcriptDetails;
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "student=" + student +
                ", transcriptDetails=" + Arrays.toString(transcriptDetails) +
                '}';
    }
}
