package DEMO_TKNGANHANG;

public class Account implements IAccount{

    private String name;
    private String accountNumber;
    private String email;
    private String accountBalance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public double recharge(double amount) {
        return 0;
    }

    @Override
    public String changeEmail(String email) {
        return null;
    }
}
