/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894039;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jordan
 */
public class Order_test {
    public static void testOutput() {
      
        
    
      
      
        // TODO code application logic here
        Pizza My_p1 = new Pizza(Size_enum.LARGE,Crust_enum.DEEP,Sauce_enum.PESTO,Topping_enum.EXTRA_CHEESE,Topping_enum.ROCKET);
        Pizza My_p2 = new Pizza(Size_enum.SMALL,Crust_enum.THIN,Sauce_enum.TOMATO,Topping_enum.PEPPERONI,Topping_enum.OLIVES);
        Pizza My_p3 = new Pizza(Size_enum.MEDIUM,Crust_enum.STUFFED,Sauce_enum.PESTO,Topping_enum.MUSHROOM,Topping_enum.ANCHOVY);
        ArrayList<Pizza>Pizzalist = new ArrayList<Pizza>();
        Pizzalist.add(My_p1);
        Pizzalist.add(My_p2);
        Pizzalist.add(My_p3);
        Order orderTest = new Order(Pizzalist);
        System.out.println("Testing order_cost "+orderTest.order_cost());
        System.out.println("Testing get order\n"+orderTest.get_order());
        System.out.println("Testing the pizza amount "+orderTest.pizza_amount());
        orderTest.Delete_pizza(0);
        System.out.println("Testing Pizza amount after deleting a pizz"+orderTest.pizza_amount());
        orderTest.Add_pizza(Size_enum.SMALL,Crust_enum.THIN,Sauce_enum.TOMATO,Topping_enum.PEPPERONI,Topping_enum.OLIVES);
        System.out.println("testing pizza amount after adding pizza"+orderTest.pizza_amount());
        System.out.println("Testing get order after adding a piza"+orderTest.get_order());
        orderTest.Edit_pizza(0,Size_enum.SMALL,Crust_enum.THIN,Sauce_enum.PESTO,Topping_enum.PEPPERONI,Topping_enum.OLIVES);
        System.out.println("Testing get order after editing a piza"+orderTest.get_order());
 
    }  
    
}
