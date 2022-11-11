import entity.Bus_ManagementDetail;
import entity.Bus_Managerment;
import entity.Driver;
import entity.Route;

import java.util.Scanner;

    public class MainRun {
        public static Driver[] drivers = new Driver[1000];
        public static Route[] routes = new Route[1000];
        public static Bus_Managerment[] busManagerments = new Bus_Managerment[1000];
        public static void main(String[] args) {

            while(true) {
                showMenu();
                int functionchoice = chooseFunction();
                functionHandle(functionchoice);
            }

        }

        private static void functionHandle(int functionchoice) {
            switch (functionchoice) {
                case 1:
                    System.out.println("Nhập vào số lượng tài xế muốn thêm: ");
                    driverInput();
                    break;
                case 2:
                    System.out.println("\nXuất ra danh sách tài xế: \n");
                    driverOuput();
                    break;
                case 3:
                    System.out.println("Nhập vào số lượng tuyến muốn thêm: ");
                    routeInput();
                    break;
                case 4:
                    System.out.println("\nXuất ra danh sách tuyến: \n");
                    routeOuput();
                    break;
                case 5:
                    busManagerment();
                    break;
                case 6:
                    showBusManagement();
                    break;
                case 7:
                    System.out.println("Danh sách phân công sau khi sắp xếp theo họ tên là :");
                    sortBusManagementByName(drivers);
                    showSortByName(drivers);
                    break;
                case 8:
                    System.out.println("Danh sách phân công sau khi sắp xếp theo số lượng tuyến đảm nhận trong ngày là :");
                    sortBusManagementByRoute();
                    showBusManagement();
                    break;
                case 9:
                    System.out.println("Danh sách tính tổng khoảng cách trong ngày của mỗi lái xe là: ");
                    distancesTotal();
                    break;
                case 10:
                    System.exit(functionchoice);
            }
        }

        private static void distancesTotal() {
            double totalDistance = 0;
            for (int i =0;i<busManagerments.length;i++) {
                for(int j=0;j<routes.length;j++) {
                    totalDistance += routes.length * routes[j].getDistance();
                }
            }
        }

        private static void sortBusManagementByRoute() {
            for (int i =0;i<busManagerments.length;i++) {
                for(int j =i+1;j<busManagerments.length;j++) {
                    Bus_Managerment temp = busManagerments[i];
                    if(busManagerments[i].getBus_managementDetails().length < busManagerments[j].getBus_managementDetails().length) {
                        temp = busManagerments[i];
                        busManagerments[i] = busManagerments[j];
                        busManagerments[j] = temp;
                    }
                }
            }
        }

        private static void sortBusManagementByName(Driver[] drivers) {
            for (int i =0;i<drivers.length;i++) {
                for(int j =i+1;j<drivers.length;j++) {
                    Driver temp = drivers[i];
                    if(drivers[i].getName().compareTo(drivers[j].getName()) > 0) {
                        temp = drivers[i];
                        drivers[i] = drivers[j];
                        drivers[j] = temp;
                    }
                }
            }
        }

        private static void showSortByName(Driver[] drivers) {
            for(int i=0;i<drivers.length;i++) {
                if(drivers[i]!=null) {
                    System.out.println(drivers[i]);
                    break;
                }
            }
        }

        private static void showBusManagement() {
            System.out.println("Xuất ra danh sách phân công :");
            for (int i = 0; i < busManagerments.length; i++) {
                if(busManagerments[i] != null) {
                    System.out.println(busManagerments[i]);
                }
            }
        }

        private static void busManagerment() {
            if(drivers.length == 0 && routes.length ==0) {
                System.out.println("Vui lòng nhập thông tin tài xế và tuyến cần chạy!!!");
                return;
            }
            System.out.println("Nhập vào số tài xế cần phân công: ");
            int driverNum = new Scanner(System.in).nextInt();
            Driver driver = null;
            for(int i=0;i<driverNum;i++) {
                System.out.println("Tài xế thứ " + (i+1) + " : " );
                System.out.println("Nhập vào mã tài xế :");
                int driverId;
                do{
                    driverId = new Scanner(System.in).nextInt();
                    for(int j=0;j<drivers.length;j++) {
                        if(drivers[j].getId() == driverId) {
                            driver = drivers[j];
                            break;
                        }
                    }
                    if(driver != null) {
                        break;
                    }
                    System.out.println("Mã tài xế không tồn tại!!!");
                }while(true);
                System.out.println("Nhập vào số tuyến tài xế cần đi: ");
                int routeNum = new Scanner(System.in).nextInt();
                Route route = null;
                int routeId;
                int count = 0;
                int turnNumTotal = 0;
                Bus_ManagementDetail[] detail = new Bus_ManagementDetail[routeNum];
                for(int j=0;j<routeNum;j++) {
                    System.out.println("Nhập vào tuyến thứ " + (j+1) + " : ");
                    System.out.println("Nhập vào mã tuyến: ");
                    do{
                        routeId = new Scanner(System.in).nextInt();
                        for(int k =0;k<routes.length;k++) {
                            if(routes[k].getRouteId() == routeId) {
                                route = routes[k];
                                break;
                            }
                        }
                        if(route != null) {
                            break;
                        }
                        System.out.println("Mã tuyến không họợp lệ !!!");
                    }while(true);
                    System.out.println("Nhập vào số lượt cần đi: ");
                    int turnNum = new Scanner(System.in).nextInt();
                    detail[count] = new Bus_ManagementDetail();
                    detail[count].setRoute(route);
                    detail[count].setStopPointQuantity(turnNum);
                    turnNumTotal += route.getStopPointNumber() * turnNum;
                    if(turnNumTotal >15 ) {
                        System.out.println("Tài xế này đã chạy quá số lượt quy định!!");
                        break;
                    }
                    count++;
                }
                Bus_Managerment bus_managerment = new Bus_Managerment(driver,detail);
                saveBusManagement(bus_managerment);

            }

        }

        private static void saveBusManagement(Bus_Managerment bus_managerment) {
            for(int i=0;i<busManagerments.length;i++) {
                    if(busManagerments[i] ==null) {
                        busManagerments[i] = bus_managerment;
                        break;
                    }
            }
        }

        private static void routeOuput() {
            for(int i =0;i< routes.length;i++) {
                if(routes[i] != null) {
                    System.out.println(routes[i]);
                }
            }
        }

        private static void routeInput() {
            int routeNum = new Scanner(System.in).nextInt();
            for(int i=0;i<routeNum;i++) {
                System.out.println("Tuyến thứ " + (i+1) + " : ");
                Route route = new Route();
                route.infoInput();
                for(int j =0;j<routes.length;j++) {
                    if(routes[i] ==null) {
                        routes[i] = route;
                        break;
                    }
                }
            }
        }

        private static void driverOuput() {
            for(int i =0;i< drivers.length;i++) {
                if(drivers[i] != null) {
                    System.out.println(drivers[i]);
                }
            }
        }

        private static void driverInput() {
            int driverNum = new Scanner(System.in).nextInt();
            for(int i=0;i<driverNum;i++) {
                System.out.println("Tài xế thứ " + (i+1) + " : ");
                Driver driver = new Driver();
                driver.infoInput();
                for(int j =0;j<drivers.length;j++) {
                    if(drivers[i] ==null) {
                        drivers[i] = driver;
                        break;
                    }
                }
            }
        }

        private static int chooseFunction() {
            int functionchoice;
            do{
                functionchoice = new Scanner(System.in).nextInt();
                if(functionchoice >=1 && functionchoice <=9) {
                    break;
                }
                System.out.println("Vui lòng chọn thao tác hợp lệ!!!");
            }while(true);
            return functionchoice;
        }

        private static void showMenu() {
            System.out.println("\n\n==========================PHẦN MỀM QUẢN LÝ PHÂN CÔNG LÁI XE BUS==========================");
            System.out.println("1. Nhập danh sách tài xế mới.");
            System.out.println("2. Xuất danh sách tài xế.");
            System.out.println("3. Nhập danh sách tuyến xe mới.");
            System.out.println("4. Xuất danh sách tuyến xe.");
            System.out.println("5. Phân công công việc cho tài xế.");
            System.out.println("6. Xuất danh sách đã được phân công công việc cho tài xế.");
            System.out.println("7. Sắp xếp danh sách phân công theo họ tên.");
            System.out.println("8. Sắp xếp danh sách phân công theo tổng số tuyến trong ngày(Giảm dần).");
            System.out.println("9. Tính tổng khoảng cách chạy xe trong ngày của mỗi tài xế.");
            System.out.println("10. Thoát chương trình.");
            System.out.print("Chọn thao tác bạn muốn thực hiện: ");
        }
    }
