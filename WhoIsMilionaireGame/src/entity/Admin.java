
package entity;

public class Admin extends Person{

    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName); 
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }
    
    
    

    public Admin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" + "userName=" + userName + ", password=" + password + '}';
    }

    @Override
    public void login() {
        
    }

    
    
}
