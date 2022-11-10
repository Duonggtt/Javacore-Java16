package entity;

import java.util.Arrays;

public class LessonManagement {

    private Teacher teacher;
    private LessonManagermentDetail[] lessonManagermentDetails;

    public LessonManagement(Teacher teacher, LessonManagermentDetail[] lessonManagermentDetails) {
        this.teacher = teacher;
        this.lessonManagermentDetails = lessonManagermentDetails;
    }

    public LessonManagement() {

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LessonManagermentDetail[] getLessonManagermentDetails() {
        return lessonManagermentDetails;
    }

    public void setLessonManagermentDetails(LessonManagermentDetail[] lessonManagermentDetails) {
        this.lessonManagermentDetails = lessonManagermentDetails;
    }

    @Override
    public String toString() {
        return "LessonManagement{" +
                "teacher=" + teacher +
                ", lessonManagermentDetails=" + Arrays.toString(lessonManagermentDetails) +
                '}';
    }



}
