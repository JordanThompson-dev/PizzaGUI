/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894039;
import java.util.ArrayList;
/**
 *
 * @author jordan
 */
public class Order {
    
    ArrayList<Pizza> order_list;

    
    public Order( ArrayList<Pizza> order_list){
        this.order_list = order_list;
    }
    public String get_order(){
        String order_info="Order: \n";;
        Pizza InfoNeeded;
      
        for (int i = 0; i < order_list.size(); i++) {
            InfoNeeded=order_list.get(i);
            order_info = order_info + InfoNeeded.Pizza_info();
			
		}
        
        return order_info;
        
        
    }
    public double order_cost(){
        double order_cost = 0;
        Pizza pizza_to_calculate;
        for (int i = 0; i < order_list.size(); i++) {
            pizza_to_calculate = order_list.get(i);
            order_cost = order_cost + pizza_to_calculate.calculate_pizza();
			
		}

     return order_cost; 
    }
    public int pizza_amount(){
       int pizza_amount = order_list.size();
        return pizza_amount;
    
    }
    public void Add_pizza(Size_enum size,Crust_enum crust,Sauce_enum sauce,Topping_enum topping1,Topping_enum topping2){
      
        Pizza My_p= new Pizza(size,crust,sauce,topping1,topping2);
        order_list.add(My_p);
        
    
        
    }
    
    
    public void Delete_pizza(int input){
        order_list.remove(input);
        

    }
    public void Edit_pizza(int input,Size_enum size,Crust_enum crust,Sauce_enum sauce,Topping_enum topping1,Topping_enum topping2){
        order_list.get(input).setSize(size);
        order_list.get(input).setCrust(crust);
        order_list.get(input).setSauce(sauce);
        order_list.get(input).setTopping1(topping1);
        order_list.get(input).setTopping2(topping2);
    
    }
    
}
