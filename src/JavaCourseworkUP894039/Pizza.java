
package JavaCourseworkUP894039;


public class Pizza {
    //Declaring my vars
    private Size_enum size;
    private Crust_enum crust;
    private Sauce_enum sauce;
    private Topping_enum topping1;
    private Topping_enum topping2;
    
    public Pizza(Size_enum sizeIn,Crust_enum crustIn,Sauce_enum sauceIn,Topping_enum topping1In,Topping_enum topping2In){
    setSize(sizeIn);
    setCrust(crustIn);
    setSauce(sauceIn);
    setTopping1(topping1In);
    setTopping2(topping2In);
    }
   public void setSize(Size_enum sizeIn){
       this.size= sizeIn;
   }
   public void setCrust(Crust_enum crustIn){
       this.crust=crustIn;
   }
   public void setSauce(Sauce_enum sauceIn){
       this.sauce=sauceIn;
   }
   public void setTopping1(Topping_enum topping1In){
       this.topping1=topping1In;
   }
   public void setTopping2(Topping_enum topping2In){
       this.topping2=topping2In;
   }
   public double getSize(){
       return this.size.getSizeCost();
   
   }
   public double getCrust(){
       return this.crust.getCrustCost();
   
   }
   public double getSauce(){
       return this.sauce.getSauceCost();
   
   }
   public double getTopping1(){
       return this.topping1.getToppingCost()*5;
   
   }
   public double getTopping2(){
       return this.topping2.getToppingCost()*4;
   
   }
   public String getSizeName(){
       return this.size.getSizeName();
   
   }
   public String getCrustName(){
    return this.crust.getCrustName();
   }
   public String getTopping1Name(){
   return this.topping1.getToppingName();
   }
   public String getTopping2Name(){
   return this.topping2.getToppingName();
   }
   public String getSauceName(){
   return this.sauce.getSauceName();
   }
   public double calculate_base(){
       double base = getSize() + getCrust();
       return base;
       
}
   public double calculate_pizza(){
       double pizza_cost = getSize() + getCrust() + getSauce() + getTopping1() + getTopping2();
       return pizza_cost;
   
   }
   public String Pizza_info(){
       String myOutput =String.format("Total Cost:£%.2f \n%s Size:£%.2f \n%s Crust:£%.2f \nBase Cost:£%.2f \n%s Topping:5 * %.2f = £%.2f \n%s Topping:4 * %.2f = £%.2f \n%s Sauce:£%.2f \n==================\n",calculate_pizza(),size.getSizeName(),getSize(),crust.getCrustName(),getCrust(),calculate_base(),topping1.getToppingName(),getTopping1()/5,getTopping1(),topping2.getToppingName(),getTopping2()/4,getTopping2(),sauce.getSauceName(),getSauce());
       return myOutput;
   }
}
   
   