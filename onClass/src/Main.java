import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaiTap b = new BaiTap();
        while(true) {
            b.showMenu();
            int funcChoice = b.func();
            b.functionMenu(funcChoice);
        }
    }
}
