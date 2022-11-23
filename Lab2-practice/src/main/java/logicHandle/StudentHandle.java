
package main.java.logicHandle;

import main.java.entity.Student;
import main.java.run.MainRun;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {
    public Student studentInput() {
        while(true) {
        try {
        Student student = new Student();
        System.out.println("=====================");
        System.out.println("Nhap ten student: ");
        student.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap diem toan: ");
        student.setScoreMath(new Scanner(System.in).nextFloat());
        System.out.println("Nhap diem ly: ");
        student.setScorePysic(new Scanner(System.in).nextFloat());
        System.out.println("Nhap diem hoa: ");
        student.setScoreChemistry(new Scanner(System.in).nextFloat());
        return student;
        } catch (Exception e) {
            System.out.println("Loi input Student!! Nhap lai");
        }
        }
    }

    public float avgScore(Student student){
        float avg = 0;
        avg = (student.getScoreMath() + student.getScorePysic() + student.getScoreChemistry()) / 3;
        student.setAvgScore(avg);
        return student.getAvgScore();
    }
    
    public void studentRank(Student student) {
        if(student.getAvgScore() >= 8) {
            student.setRank("Loai A!");
        }else if(student.getAvgScore()>=6.5 && student.getAvgScore()<8) {
            student.setRank("Loai B!");
        }else if(student.getAvgScore() <6.5) {
            student.setRank("Loai C!");
        }else {
            student.setRank("Ban phai hoc lai mon!");
        }
    }

    public void studentOutput(ArrayList<Student> students) {
        System.out.println("Thong tin hoc sinh : ");
        for(int i =0;i< students.size();i++){
            System.out.println("\n========= Student " + (i+1) + " =========");
            System.out.print("Name: ");
            System.out.print(students.get(i).getName());
            System.out.print("\nDiem trung binh hoc sinh: ");
            System.out.printf("%.2f\n",students.get(i).getAvgScore());
            System.out.print("Xep loai hoc sinh: ");
            System.out.print(students.get(i).getRank());
        }
    }
}
