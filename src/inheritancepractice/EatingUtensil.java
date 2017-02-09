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
public class EatingUtensil extends Utensil {
    private String meal;
    private String brand;

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void use(){
        System.out.println("We are eating with this");
    }
    
    public void chuck(){
        System.out.println("We are very rudely tossing this eating untensil "
                + "across the room.");
    }
}
