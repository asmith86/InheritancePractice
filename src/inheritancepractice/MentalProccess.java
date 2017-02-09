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
public class MentalProccess {
    private String neuronalPattern;
    private String content;

    public String getNeuronalPattern() {
        return neuronalPattern;
    }

    public void setNeuronalPattern(String neuronalPattern) {
        this.neuronalPattern = neuronalPattern;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void initiate(){
        System.out.println("Begin experience");
    }
    
    public void extinguish(){
        System.out.println("End experience");
    }
}
