package logicHandle;

import entity.Clazz;
import entity.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClazzHandle {
    StudentHandle studentHandle = new StudentHandle();
    ArrayList<Student> students;
    public Clazz clazzInput() throws ParseException {
        Clazz clazz = new Clazz();
       while(true){
           try{
               System.out.println("Nhập tên môn học: ");
               clazz.setSubject(new Scanner(System.in).nextLine());
               break;
           }catch(Exception e){
               System.out.println("Invalid input type! Import again: ");
           }
       }
        students = new ArrayList<>();
        System.out.println("Nhập số học sinh muốn thêm: ");
        int studentNum;
        do {
            try{
                studentNum = new Scanner(System.in).nextInt();
                if(studentNum > 0) {
                    break;
                }
                System.out.println("Số học viên không được âm! Vui lòng nhập lại: ");
            }catch(Exception e){
                System.out.println("Invalid input type! Import again: ");
            }
        }while(true);
        for (int i = 0; i < studentNum; i++) {
            System.out.println("Học viên thứ " + (i+1));
            Student student = studentHandle.studentInput();
            students.add(student);
            clazz.setStudents(students);
        }
        return clazz;
    }

}
