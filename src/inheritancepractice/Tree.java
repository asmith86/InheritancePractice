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
public class Tree extends Plant {
    private int leafCount;
    private int branchCount;

    public int getLeafCount() {
        return leafCount;
    }

    public void setLeafCount(int leafCount) {
        this.leafCount = leafCount;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }
    
    @Override
    public void reproduce(){
        System.out.println("Dropping fruit.");
    } 
    
    public void dropLeaves(){
        System.out.println("Dropping leaves");
        this.leafCount = 0;
    }
}
