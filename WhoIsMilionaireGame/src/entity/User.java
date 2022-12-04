/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class User extends Person{
   
    private String email;
    private String MoneyBonus;

    public String getMoneyBonus() {
        return MoneyBonus;
    }

    public void setMoneyBonus(String MoneyBonus) {
        this.MoneyBonus = MoneyBonus;
    }

    public User() {
    }

    public User(String userName, String password, String email) {
        
        this.email = email;
    }
    
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
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

    
    @Override
    public void login() {
        
    }
    
    

    @Override
    public String toString() {
        return super.userName + "\t" + super.password+ "\t" + email ;
    }

    
}
