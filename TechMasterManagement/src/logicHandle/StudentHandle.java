package logicHandle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {


    public Student student = new Student();
    public static Student inputInfo() {
        student = new Student();
        System.out.println("Nhập vào thông tin học viên.");
        System.out.println("Nhập id học viên: ");
        student.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhập tên học viên: ");
        student.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập tuổi học viên: ");
        student.setAge(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhập học lực của học viên: ");
        student.setRank(new Scanner(System.in).nextLine());
        return student;
    }

    public static void rankUpdateById() {
        System.out.println("Nhập id học viên bạn muốn tìm: ");
        int studentId;
        do {
            boolean isCheck = false;
            studentId = new Scanner(System.in).nextInt();
            for(int i = 0 ; i< ClazzHandle.students.size();i++) {
                if(ClazzHandle.students.get(i).getId() == studentId) {
                    System.out.println("Cập nhật thông tin học lực của học viên có id " + studentId);
                    ClazzHandle.students.get(i).setRank(new Scanner(System.in).nextLine());
                    isCheck = true;
                    break;
                }
            }if(isCheck) {
                System.out.println("Cập nhật thông tin thành công!");
                break;
            }System.out.println("Id bạn tìm không tồn tại! Vui lòng nhập lại: ");
        }while(true);
    }

    public static void removeStudent() {
        System.out.println("Nhập id học viên bạn muốn xóa: ");
        int studentId;
        do {
            boolean isChecked = false;
            studentId = new Scanner(System.in).nextInt();
            for(int i = 0 ; i< ClazzHandle.students.size();i++) {
                if(ClazzHandle.students.get(i).getId() == studentId) {
                    ClazzHandle.students.remove(ClazzHandle.students.get(i));
                    isChecked = true;
                    break;
                }
            }
            if(isChecked) {
                System.out.println("Xóa thông tin thành công");
                break;
            }
            System.out.println("Id bạn tìm không tồn tại! Vui lòng nhập lại: ");
        }while(true);
    }

    public static void updateStudent() {
        ClazzHandle.students.add(inputInfo());
        System.out.println("Update học viên thành công!");

    }
}
