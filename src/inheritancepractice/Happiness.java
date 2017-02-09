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
public class Happiness extends Emotion {
    public String positiveCircumstance;
    public boolean isDueToCake;

    public String getPositiveCircumstance() {
        return positiveCircumstance;
    }

    public void setPositiveCircumstance(String positiveCircumstance) {
        this.positiveCircumstance = positiveCircumstance;
    }

    public boolean isIsDueToCake() {
        return isDueToCake;
    }

    public void setIsDueToCake(boolean isDueToCake) {
        this.isDueToCake = isDueToCake;
    }
    
    @Override
     public void produceBehavior(){
        System.out.println("I'm doing a fist-pump");
    }
    
    @Override
    public void alterMotivation(){
        System.out.println("I would like to enjoy cake.");
    }
}
