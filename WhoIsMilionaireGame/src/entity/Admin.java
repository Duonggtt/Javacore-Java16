/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */
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

    
    
}
