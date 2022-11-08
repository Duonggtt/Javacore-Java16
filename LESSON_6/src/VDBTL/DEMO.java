package VDBTL;

public class DEMO {
    private static int Handle(int n) {
        if(n == 0) {
            return 0;
        }
        System.out.println("Hello word!");
        return Handle(n-1);
    }

    public static void main(String[] args) {
        Handle(1000);
    }
}
