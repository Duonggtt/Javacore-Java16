package DEMO_TKNGANHANG;

public class MainRun {

    public static void main(String[] args) {
        Account account = new Account();
        account.setEmail("Thay doi email");
        account.setAccountNumber("So tai khoan");
        account.setAccountBalance("so du tai khoan ban dau");
        account.setName("duong");
        account.recharge(12);
        account.changeEmail("Email moi");
        account.displayInfo();
    }

}
