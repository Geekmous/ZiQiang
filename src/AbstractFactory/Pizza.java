package AbstractFactory;

import java.util.ArrayList;

import AbstractFactory.Ingredient.Cheese;
import AbstractFactory.Ingredient.Clams;
import AbstractFactory.Ingredient.Dough;
import AbstractFactory.Ingredient.Pepperoni;
import AbstractFactory.Ingredient.Sauce;
import AbstractFactory.Ingredient.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	ArrayList toppings = new ArrayList();
	
	
    abstract void prepare();
    	  
     void bake() {
    	  System.out.println("Bake for 25 minutes at 350");
     }
     
     void cut() {
    	  System.out.println("Cutting the pizza into diagonal slices");
     }
     void box() {
    	  System.out.println("Place pizza in official PizzaStore box");
     }
      
     public String getName() {
    	 return name; 
     }
      
     void setName(String name) {
    	  this.name = name;
     }
    //  public String toString(){
    	  
    //  }
}
