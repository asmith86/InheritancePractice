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
public class Life {
    private boolean isLiving;
    private int age;

    public boolean isIsLiving() {
        return isLiving;
    }

    public void setIsLiving(boolean isLiving) {
        this.isLiving = isLiving;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void reproduce(){
        System.out.println("Reproducing....");
    }
    
    public void excreteWaste(){
        System.out.println("Removing waste.");
    }
}
