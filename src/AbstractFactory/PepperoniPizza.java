package AbstractFactory;

public class PepperoniPizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory	=	ingredientFactory;
	}
	
	void prepare(){
		System.out.println("Preparing "+name);
		dough	=	this.ingredientFactory.createDough();
		sauce	=	this.ingredientFactory.createSauce();
		cheese	=	this.ingredientFactory.createCheese();
	}
}
