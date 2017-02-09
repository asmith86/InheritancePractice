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
public class Demon extends MalevolentBeing{
    private String weapon;
    private String incantation;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getIncantation() {
        return incantation;
    }

    public void setIncantation(String incantation) {
        this.incantation = incantation;
    }
    
    public void summon(String incantation){
       if(this.incantation.equals(incantation)){
           System.out.println("You have summoned me!");
       } else {
           System.out.println("I remain sleeping...");
       }
    }
    
    public void reversePrayer(String prayer){
        System.out.println(new StringBuilder(prayer).reverse());
    }
}
