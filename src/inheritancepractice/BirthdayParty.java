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
public class BirthdayParty extends Party {
    private String birthdayPerson;
    private int candleNumber;

    public String getBirthdayPerson() {
        return birthdayPerson;
    }

    public void setBirthdayPerson(String birthdayPerson) {
        this.birthdayPerson = birthdayPerson;
    }

    public int getCandleNumber() {
        return candleNumber;
    }

    public void setCandleNumber(int candleNumber) {
        this.candleNumber = candleNumber;
    }
    
    @Override
     public void partyTime(){
        System.out.println("Happy Birthday " + this.getBirthdayPerson() + "!");
    }
    
    @Override
    public void playMusic(){
        System.out.println("Playing birthday song");
    }
}
