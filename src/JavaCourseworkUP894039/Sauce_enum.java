/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894039;


public enum Sauce_enum {
    TOMATO(0.0,"TOMATO"),PESTO(0.50,"PESTO");
    private double sauce_cost;
    private String sauce_name;

  
    
    Sauce_enum(double sauce_cost,String name){
        this.sauce_cost = sauce_cost;
        this.sauce_name = name;
        
        
    }
    public double getSauceCost(){
        return sauce_cost;
    }
    public String getSauceName(){
        return sauce_name;
        }
}
