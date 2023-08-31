public class Main {
    public static Employee[] employees = new Employee[3];

    public static void main(String[] args) {

        inputEmployee();
        salaryCaculate();
        employeeOutput();
    }

    private static void employeeOutput() {
        System.out.println("=======================Bảng thông tin nhân viên trong công ty=======================");
        System.out.printf("%-12s%-20s%-20s%-20s%-15s\n","id ","Tên nhân viên ","Thời gian công tác ","Vị trí nhân viên ","Lương ");
        for(int i =0;i<employees.length;i++) {
            System.out.printf("%-12d%-20s%-20d%-20s%-%f\n",employees[i].getId(),employees[i].getName(),employees[i].getDate(),employees[i].getPosition(),employees[i].getSalary());
        }
        System.out.println("====================================================================================");
    }

    private static void inputEmployee() {
        Employee employee = new Employee();
        System.out.println("Nhập 3 nhân viên vào mảng.");
        for(int i =0;i< employees.length;i++) {
            System.out.println("Nhâp vào nhân viên thứ " + (i+1));
            employees[i] = employee.InfoInput();
        }
    }

    private static void salaryCaculate() {
        double luongCoBan = 500;
        double phuCap = 0;
        double heSoThamNiem = 0;

        for(Employee e : employees) {
            if(e.getDate() < 5) {
                heSoThamNiem = 1.0;
            }else {
                heSoThamNiem = 1.5;
            }
            if(e.getPosition().equals("Nhân viên")) {
                phuCap = 100;
            }else if(e.getPosition().equals("Quản lý cấp thấp")) {
                phuCap = 200;
            }else if(e.getPosition().equals("Quản lý cấp trung")) {
                phuCap = 300;
            }else if(e.getPosition().equals("Quản lý cao cấp")) {
                phuCap = 400;
            }else {
                phuCap = 0;
            }
            double salary = luongCoBan * phuCap * heSoThamNiem;
            e.setSalary(salary);
        }
    }
}