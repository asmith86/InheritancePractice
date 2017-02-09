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
public class RunningShoe extends Shoe {
    private String stabilityRating;
    private String style;

    public String getStabilityRating() {
        return stabilityRating;
    }

    public void setStabilityRating(String stabilityRating) {
        this.stabilityRating = stabilityRating;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    
    @Override
    public void run(){
        System.out.println("We are now running in a running shoe.");
    }
    
    public final void sprint() {
        System.out.println("I am sprinting");
    }
    
}
