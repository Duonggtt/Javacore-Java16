package logicHandle;

import entity.Clazz;
import entity.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClazzHandle {
    public static ArrayList<Student> students = new ArrayList<>();
    public static Clazz clazz = new Clazz();

    public static Clazz inputInfo() throws ParseException {
        clazz = new Clazz();
        System.out.println("Import number of student: ");
        int studentNum = new Scanner(System.in).nextInt();
        for(int i =0;i<studentNum;i++) {
            System.out.println("Student " + (i+1));
            Student student = StudentHandle.inputInfo();
            students.add(student);
            clazz.setStudents(students);
        }
        return clazz;
    }

    public static void exportStudentByClazz() {
        for(int i  = 0 ;i<ClazzHandle.students.size();i++) {
            if(SchoolHandle.school.getClazzes().get(i).equals("10A1")) {
                System.out.println(SchoolHandle.school.getClazzes().get(i));
            }
        }
    }
}
