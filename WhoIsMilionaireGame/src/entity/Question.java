/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Question implements Serializable{
    private int id ;
    private int AUTO_ID = 0;
    private String title;
    private String topic;
    private int answerId;
    

    
    public Question() {
        AUTO_ID++;
        this.id = AUTO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Question(String title, String topic) {
        this.title = title;
        this.topic = topic;
    }

 

    public Question(String title, String topic, int answerId) {
        AUTO_ID++;
        this.id = AUTO_ID;
        this.title = title;
        this.topic = topic;
        this.answerId = answerId;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        
        this.answerId = answerId;
    }

    @Override
    public String toString() {
        return "Question{" + "title=" + title + '}';
    }

    
}
