/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894039;

/**
 *
 * @author up894039
 */
public class Pizza_Test 
{
    public Pizza_Test()
    {
       

    
    }
     public static void testOutput() {
      
        
    
      
      
        // TODO code application logic here
        Pizza My_p1 = new Pizza(Size_enum.LARGE,Crust_enum.DEEP,Sauce_enum.PESTO,Topping_enum.EXTRA_CHEESE,Topping_enum.ROCKET);
        Pizza My_p2 = new Pizza(Size_enum.SMALL,Crust_enum.THIN,Sauce_enum.TOMATO,Topping_enum.PEPPERONI,Topping_enum.OLIVES);
        System.out.println("Testing Base cost " +My_p1.calculate_base());
        System.out.println("Testing Calculate Pizza " +My_p1.calculate_pizza());
        System.out.println("Testing Pizza info for one pizza\n"+My_p1.Pizza_info());
        System.out.println("Testing Pizza info for another pizza\n"+My_p2.Pizza_info());
        System.out.println("Testing Get SizeName and Get Size " +My_p1.getSizeName() +My_p1.getSize());
        System.out.println("Testing Get CrustName and Get Crust " +My_p1.getCrustName() +My_p1.getCrust());
        System.out.println("Testing Get Topping1Name and Get Topping1 " +My_p1.getTopping1Name() +My_p1.getTopping1());
        System.out.println("Testing Get Topping2Name and Get Topping2 " +My_p1.getTopping2Name() +My_p1.getTopping2());
        System.out.println("Testing Get SauceName and Get Sauce " +My_p1.getSauceName() +My_p1.getSauce());
        My_p1.setSize(Size_enum.MEDIUM);
        My_p1.setCrust(Crust_enum.THIN);
        My_p1.setTopping1(Topping_enum.ANCHOVY);
        My_p1.setTopping2(Topping_enum.MUSHROOM);
        My_p1.setSauce(Sauce_enum.TOMATO);
        System.out.println("Testing Pizza info for one pizza after using all the set size functions\n"+My_p1.Pizza_info());
        
          
     
    }
    
    
}
