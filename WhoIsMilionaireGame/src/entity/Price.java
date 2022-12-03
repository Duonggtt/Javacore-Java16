/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */
public class Price {
    private String price;
    private int id;

    public Price() {
    }

    
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Price(String price, int id) {
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Price{" + "price=" + price + ", id=" + id + '}';
    }
    
    
}
