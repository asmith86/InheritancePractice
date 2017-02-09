/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author Alex
 */
public class Celebration extends Event {
    private String[] attendants;
    private String location;

   
    
    public String[] getAttendants() {
        return attendants;
    }

    public void setAttendants(String[] attendants) {
        this.attendants = attendants;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void partyTime(){
        System.out.println("It's party time!!");
    }
    
    public void playMusic(){
        System.out.println("Playing festive music.");
    }
}
