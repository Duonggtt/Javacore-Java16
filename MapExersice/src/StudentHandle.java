import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHandle {

    public void inputInfo(Map<Integer, Student> map) {
        System.out.println("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        while(map.size() < n){
            try{
                Student student = new Student();
                System.out.println("Nhập thông tin học sinh :");
                System.out.println("Nhập id: ");
                student.setId(Integer.parseInt(new Scanner(System.in).nextLine()));
                System.out.println("Nhập tên: ");
                student.setName(new Scanner(System.in).nextLine());
                System.out.println("Nhập tuổi: ");
                student.setAge(Integer.parseInt(new Scanner(System.in).nextLine()));
                System.out.println("Nhập điểm: ");
                student.setScore(Double.parseDouble(new Scanner(System.in).nextLine()));
                map.put(student.getId(),student);
            }catch(Exception e){
                System.out.println("Error something.....");
            }
        }

        for(Map.Entry<Integer,Student> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public void findStudentById(Map<Integer, Student> map) {
        for(Map.Entry<Integer,Student> entry : map.entrySet()){
            try{
                System.out.println("Nhập id bạn muốn tìm: ");
                int findKey = Integer.parseInt(new Scanner(System.in).nextLine());
                if(map.containsKey(findKey)){
                    System.out.println("Sinh viên bạn cần tìm: " + map.get(findKey));
                    break;
                }else{
                    System.out.println("Sinh viên bạn muốn tìm ko tồn tại!");
                }
            }catch(Exception e){
                System.out.println("Error...");
            }
        }
    }

    public void updateStudentById(Map<Integer, Student> map) {
        for(Map.Entry<Integer,Student> entry : map.entrySet()){
            try{
                System.out.println("Nhập id bạn muốn update: ");
                int findKey = Integer.parseInt(new Scanner(System.in).nextLine());
                if(map.containsKey(findKey)){
                    System.out.println("Nhập id mới: ");
                    entry.getValue().setId(Integer.parseInt(new Scanner(System.in).nextLine()));
                    System.out.println("Nhập tên mới: ");
                    entry.getValue().setName(new Scanner(System.in).nextLine());
                    System.out.println("Nhập tuổi mới: ");
                    entry.getValue().setAge(Integer.parseInt(new Scanner(System.in).nextLine()));
                    System.out.println("Nhập điểm mới: ");
                    entry.getValue().setScore(Double.parseDouble(new Scanner(System.in).nextLine()));
                    break;
                }else{
                    System.out.println("Sinh viên bạn muốn tìm ko tồn tại!");
                }
            }catch(Exception e){
                System.out.println("Error...");
            }
        }
        for(Map.Entry<Integer,Student> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
