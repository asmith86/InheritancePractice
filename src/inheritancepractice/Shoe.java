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
public class Shoe extends Footwear {
    private String size;
    private String width;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
    @Override
    public void walk(){
        System.out.println("I am a shoe and I'm walking.");
    }
    
    @Override
    public void run(){
        System.out.println("I am a shoe and I'm running.");
    }
    
    public void lace(){
        System.out.println("The shoelaces have been tied.");
    }
}
