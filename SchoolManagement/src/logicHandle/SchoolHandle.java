package logicHandle;

import entity.Clazz;
import entity.School;
import entity.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolHandle {
    ClazzHandle clazzHandle = new ClazzHandle();

    public School schoolInput() throws ParseException {
        School school = new School();
        System.out.println("Nhập thông tin trường học");
        System.out.println("Nhập tên khóa học: ");
        school.setCourse(new Scanner(System.in).nextLine());
        System.out.println("Nhập số kì học: ");
        school.setSemester(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Nhập vào số lớp học bạn muốn thêm: ");
        int clazzNum = Integer.parseInt(new Scanner(System.in).nextLine());
        ArrayList<Clazz> clazzes = new ArrayList<>();
        for(int i=0;i<clazzNum;i++) {
            System.out.println("Lớp thứ " + (i+1));
            Clazz clazz = clazzHandle.classInput();
            clazzes.add(clazz);
            school.setClazzes(clazzes);
        }
        return school;
    }

    public void schoolOutput(School school) {
        System.out.println(school);
    }


    // get student là lấy ra student mà:V ohhh

    public void getStudentByClassName(School school) {
        boolean isCheck = false;
        for(int i =0;i<school.getClazzes().size();i++) {
            // minhf cần lấy tất cả hs dựa theo lớp, mình cần kiểm tra xem lớp đó có tồn tại k và nếu tồn tại thì kiểm tra xem có hs nào trong lớp đó k
            if(school.getClazzes().get(i).getName().equals("10A1") && school.getClazzes().get(i).getStudents().size()>0) {
                System.out.println("Những học sinh học lớp 10A1 là: ");
                // nếu có thì in ra các hs đó
                for (Student student: school.getClazzes().get(i).getStudents()){
                    System.out.println(student);
                    isCheck=true;
                }
                break;
            }
        }
        if(!isCheck) {
            System.out.println("K có hs nào trong lớp 10A1");
        }

    }

    public void getStudentByDobAndAdress(School school) {
        boolean isCheck = false;
        for(int i =0;i<school.getClazzes().size();i++){
            for(int j=0;j<school.getClazzes().get(i).getStudents().size();j++){
                if((school.getClazzes().get(i).getStudents().get(j).getDob().getYear() + 1900) ==1985 && school.getClazzes().get(i).getStudents().get(j).getAddress().equals("Thái Nguyên")) {
                    System.out.println("Những học sinh sinh năm 1985 và sống tại thái nguyên là: ");
                    for(Student student : school.getClazzes().get(i).getStudents()) {
                        System.out.println(student);
                        isCheck = true;
                    }
                    break;
                }
            }
        }
        if(!isCheck) {
            System.out.println("Khoong tim thay  dữ liệu!");
        }
    }
}
