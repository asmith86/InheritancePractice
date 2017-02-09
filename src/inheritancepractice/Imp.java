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
public class Imp extends Demon {
    private double wingspan;
    private String musicalInstrument;

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public String getMusicalInstrument() {
        return musicalInstrument;
    }

    public void setMusicalInstrument(String musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }
    
    public void fly(){
        System.out.println("Im flying!");
    }
    
    public void doABarrelRoll(){
        this.fly();
        System.out.println("I'm doing a barrel roll!");
    }
    
}
