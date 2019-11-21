/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894039;


public enum Topping_enum {
    NONE(0,"NONE"),OLIVES(0.08,"OLIVES"),EXTRA_CHEESE(0.02,"EXTRA_CHEESE"),CHILLI(0.06,"CHILLI"),PEPPERONI(0.10,"PEPPERONI"),MUSHROOM(0.03,"MUSHROOM"),ROCKET(0.05,"ROCKET"),JALAPENOS(0.20,"JALAPENOS"),ONION(0.07,"ONION"),ANCHOVY(0.09,"ANCHOVY");
    private double topping_cost;
    private String topping_name;

  
    
    Topping_enum(double topping_cost,String name){
        this.topping_cost = topping_cost;
        this.topping_name = name;
        
        
    }
    public double getToppingCost(){
        return topping_cost;
    }
    public String getToppingName(){
        return topping_name;
        }
}
