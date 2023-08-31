import java.util.Scanner;

public class Employee {

    private int id;
    private String name;
    private int date;
    private String position;

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee InfoInput() {
        Employee employee = new Employee();
        System.out.println("Nhap id nhan vien:");
        employee.setId(new Scanner(System.in).nextInt());
        System.out.println("Nhập tên nhân viên: ");
        employee.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập số ngày làm việc của nhân viên: ");
        employee.setDate(new Scanner(System.in).nextInt());
        System.out.println("Nhập vị trí nhân viên: ");
        System.out.println("1. Quản lý cấp cao.");
        System.out.println("2. Quản lý cấp trung.");
        System.out.println("3. Quản lý cấp thấp.");
        System.out.println("4. Nhân viên.");
        int levelChoice = 0;
        do{
            levelChoice = new Scanner(System.in).nextInt();
            if(levelChoice >=1 && levelChoice <=4) {
                break;
            }
            System.out.println("Vui lòng chọn trình độ giảng viên hợp lệ!");
        }while(true);
        switch (levelChoice) {
            case 1:
                employee.setPosition(PositionType.QL_CC.value);
                break;
            case 2:
                employee.setPosition(PositionType.QL_CT.value);
                break;
            case 3:
                employee.setPosition(PositionType.QL_CThap.value);
                break;
            case 4:
                employee.setPosition(PositionType.NV.value);
                break;
        }
        return employee;
    }
}
