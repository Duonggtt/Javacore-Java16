/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Answer implements Serializable{
    private int id;
    private String answwer;

    public Answer() {
    }

    public Answer(String answwer) {
        this.answwer = answwer;
    }

    public Answer(int id, String answwer) {
        this.id = id;
        this.answwer = answwer;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        
        this.id = id;
    }

    public String getAnswwer() {
        
        return answwer;
    }

    public void setAnswwer(String answwer) {
        this.answwer = answwer;
    }

    @Override
    public String toString() {
        return "Answer{" + "answwer=" + answwer + '}';
    }
    
    
}
