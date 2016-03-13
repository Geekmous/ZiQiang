package AbstractFactory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	ArrayList toppings	=	new ArrayList();
	
      abstract void prepare();
    	
       
     void bake()
      {
    	  System.out.println("Bake for 25 minutes at 350");
      }
       void cut(){
    	   System.out.println("Cutting the pizza into diagonal slices");
       }
      void box(){
    	  System.out.println("Place pizza in official PizzaStore box");
      }
      
      public String getName(){
    	  return name;
      }
      
      void setName(String name){
    	  this.name	=	name;
      }
      public String toString(){
    	  
      }
}
