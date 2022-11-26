package run;

import entity.User;
import entity.Admin;
import java.util.ArrayList;
import java.util.Arrays;
import showDisplay.LogOrRegForm;
import showDisplay.LoginForm;
import showDisplay.LoginForm;
import showDisplay.RegisterForm;
import showDisplay.RegisterForm;

public class MainRun {
    public static ArrayList<User> users = new ArrayList<>();    
    public static ArrayList<Admin> admins = new ArrayList<>(Arrays.asList(new Admin("admin", "123")));

    public static void main(String[] args) {
        LogOrRegForm logOrRegForm = new LogOrRegForm();
        logOrRegForm.setVisible(true);
    }
}
