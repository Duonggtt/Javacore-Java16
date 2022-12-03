
package run;

import entity.Admin;
import entity.User;
import java.util.ArrayList;
import java.util.Arrays;
import loginAndReg.HomeMenu;

public class MainRun {
    public static ArrayList<User> users = new ArrayList<>(Arrays.asList(new User("duong","123")));    
    public static ArrayList<Admin> admins = new ArrayList<>(Arrays.asList(new Admin("admin", "123")));

    public static void main(String[] args) {
        HomeMenu homeMenu = new HomeMenu();
        homeMenu.setVisible(true);
    }
}
