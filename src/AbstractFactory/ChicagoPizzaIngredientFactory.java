package AbstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough(){
		return new ThickCrusDough();
		
	}
	
	public Sauce createSauce() {
	return new PlumTomatoSauce();
	
	}
	
	public Cheese createCheese(){
		return new Mozzarella();
		
	}
	public Veggies[] createVeggies(){
		Veggies veggies[] =	{new Spinach(),new eggplant(),new Blackolives()};
		return veggies;
	}
	public Pepperoni createPepperoni{
		return new SlicedPepperoni();
	}
	public Clams CreateClam(){
		return new FrozenClams();
	}
}
