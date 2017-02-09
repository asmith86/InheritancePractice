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
public class Plant extends Life {
    private int length;
    private double waterLevel;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }
    
    public void photosynthesize(){
        System.out.println("getting nutrients from sun.");
    }
    
    @Override
    public void reproduce(){
        System.out.println("Releasing Pollen");
    }
}
