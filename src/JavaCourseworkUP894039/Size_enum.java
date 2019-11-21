/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894039;


public enum Size_enum {
    SMALL(9.56,"SMALL"),MEDIUM(11.87,"MEDIUM"),LARGE(15.90,"LARGE");
    private double size_cost;
    private String size_name;

  
    
    Size_enum(double size_cost,String name){
        this.size_cost = size_cost;
        this.size_name = name;
        
        
    }
    public double getSizeCost(){
        return size_cost;
    }
    public String getSizeName(){
        return size_name;
        }
}
