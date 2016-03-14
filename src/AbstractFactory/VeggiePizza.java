package AbstractFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Preparing "+name);
		dough = this.ingredientFactory.createDough();
		sauce =	this.ingredientFactory.createSauce();
		cheese = this.ingredientFactory.createCheese();
	}
}
