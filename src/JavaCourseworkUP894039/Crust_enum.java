/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894039;


public enum Crust_enum {
    THIN(1.08,"THIN"),DEEP(1.10,"DEEP"),STUFFED(2.14,"STUFFED");
    private double crust_cost;
    private String crust_name;

  
    
    Crust_enum(double crust_cost,String name){
        this.crust_cost = crust_cost;
        this.crust_name = name;
        
    }
    public double getCrustCost(){
        return crust_cost;
    }
    public String getCrustName(){
        return crust_name;
        }
}
