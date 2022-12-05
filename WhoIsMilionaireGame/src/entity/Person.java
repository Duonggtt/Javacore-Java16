
package entity;

public abstract class Person {
    protected String userName;
    protected String password;
    
    
    //tinh triu tuong
    public abstract void login();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return userName + password ;
    }
    
    
}
