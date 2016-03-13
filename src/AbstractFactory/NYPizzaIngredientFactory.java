package AbstractFactory;

import AbstractFactory.Ingredient.Cheese;

import AbstractFactory.Ingredient.Clams;
import AbstractFactory.Ingredient.Dough;
import AbstractFactory.Ingredient.FreshClams;
import AbstractFactory.Ingredient.Garlic;
import AbstractFactory.Ingredient.MarinaraSauce;
import AbstractFactory.Ingredient.Mushroom;
import AbstractFactory.Ingredient.Onion;
import AbstractFactory.Ingredient.Pepperoni;
import AbstractFactory.Ingredient.RedPepper;
import AbstractFactory.Ingredient.ReggianoCheese;
import AbstractFactory.Ingredient.Sauce;
import AbstractFactory.Ingredient.SlicedPepperoni;
import AbstractFactory.Ingredient.ThinCrustDough;
import AbstractFactory.Ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
	
	public Dough createDough(){
		return new ThinCrustDough();
		
	}	
	public Sauce createSauce() {
	return new MarinaraSauce();	
	}
	
	public Cheese createCheese(){
		return new ReggianoCheese();		
	}
	
	public Veggies[] createVeggies(){
		Veggies veggies[] =	{new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}
	
	public Pepperoni createPepperoni(){
		return new SlicedPepperoni();
	}
	public Clams createClam(){
		return new FreshClams();
	}
}
