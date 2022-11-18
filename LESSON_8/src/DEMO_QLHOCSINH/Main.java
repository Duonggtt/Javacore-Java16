package DEMO_QLHOCSINH;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Duong");
        System.out.println("Ten: " + student.getName());
        student.setAge(18);
        System.out.println("Tuoi:" + student.getAge());
        student.setMarks(8.5);
        System.out.println("Diem: " + student.getMarks());
        student.display();
    }
}
