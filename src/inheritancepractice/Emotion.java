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
public class Emotion extends MentalProccess {
    private double duration;
    private int intensityLevel;

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

   

    public int getIntensityLevel() {
        return intensityLevel;
    }

    public void setIntensityLevel(int intensityLevel) {
        this.intensityLevel = intensityLevel;
    }
    
    public void produceBehavior(){
        System.out.println("I'm doing something based on this emotional state.");
    }
    
    public void alterMotivation(){
        System.out.println("My motivation has changed.");
    }
    
}
