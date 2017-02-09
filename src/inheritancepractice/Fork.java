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
public class Fork extends EatingUtensil {
    private int numberOfProngs;
    private int length;

    public int getNumberOfProngs() {
        return numberOfProngs;
    }

    public void setNumberOfProngs(int numberOfProngs) {
        this.numberOfProngs = numberOfProngs;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public void twirlPasta(){
        System.out.println("Twirling pasta is an advanced use for a Fork.");
    }
    
    public void stab(){
        System.out.println("Using forks to stab can result in negative consequences.");
    }
    
    
}
