package DEMO_QLHOCSINH;

public class Student implements Iclassification{

    private String name;
    private int age;
    private double marks;
    private String classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public void classify() {
        if(marks >=8) {
            System.out.println("Loai A.");
        }else if(marks < 8 && marks > 6.5) {
            System.out.println("Loai B.");
        }else {
            System.out.println("Loai C.");
        }
    }

    @Override
    public void display() {
        classify();
    }
}
