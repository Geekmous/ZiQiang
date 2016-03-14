package AbstractFactory;

import AbstractFactory.Ingredient.Cheese;
import AbstractFactory.Ingredient.Clams;
import AbstractFactory.Ingredient.Dough;
import AbstractFactory.Ingredient.Pepperoni;
import AbstractFactory.Ingredient.Sauce;
import AbstractFactory.Ingredient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
