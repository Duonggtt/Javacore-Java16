import java.util.Scanner;

public class Member {

    private int id;
    private String name;
    private String dob;
    private String job;


    public Member(int id, String name, String dob, String job) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    public Member() {

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
    public static Member infoInput() {
        Member member = new Member();
            System.out.println("Nhap id: ");
            member.setId(new Scanner(System.in).nextInt());
            System.out.println("Nhap name: ");
            member.setName(new Scanner(System.in).nextLine());
            System.out.println("Nhap dob: ");
            member.setDob(new Scanner(System.in).nextLine());
            System.out.println("Nhap job: ");
            member.setJob(new Scanner(System.in).nextLine());
        return member;
    }
}
