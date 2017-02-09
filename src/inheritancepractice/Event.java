/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Event {
    public Date date;
    private String name;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void createNotice(){
        System.out.println("There is an Event going on on: " + this.getDate());
    }
    
    public void haveEvent(){
        System.out.println("The Event is going on now.");
    }
}
