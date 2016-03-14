package AbstractFactory;

import AbstractFactory.Ingredient.Blackolives;
import AbstractFactory.Ingredient.Cheese;
import AbstractFactory.Ingredient.Clams;
import AbstractFactory.Ingredient.Dough;
import AbstractFactory.Ingredient.FrozenClams;
import AbstractFactory.Ingredient.Mozzarella;
import AbstractFactory.Ingredient.Pepperoni;
import AbstractFactory.Ingredient.PlumTomatoSauce;
import AbstractFactory.Ingredient.Sauce;
import AbstractFactory.Ingredient.SlicedPepperoni;
import AbstractFactory.Ingredient.Spinach;
import AbstractFactory.Ingredient.ThickCrusDough;
import AbstractFactory.Ingredient.Veggies;
import AbstractFactory.Ingredient.eggplant;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	
	public Dough createDough() {
		return new ThickCrusDough();		
	}
	
	public Sauce createSauce() {
	    return new PlumTomatoSauce();
	
	}
	
	public Cheese createCheese() {
		return new Mozzarella();
		
	}
	public Veggies[] createVeggies() {
		Veggies veggies[] =	{new Spinach(), new eggplant(), new Blackolives()};
		return veggies;
	}
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	public Clams createClam() {
		return new FrozenClams();
	}

	

	
}
