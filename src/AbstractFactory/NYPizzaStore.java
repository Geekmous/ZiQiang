package AbstractFactory;

public class NYPizzaStore extends PizzaStore{
	Pizza pizza;
	
	protected Pizza createPizza(String item){
		Pizza pizza	=	null;
		PizzaIngredientFactory ingredientFactory	=	new NYPizzaIngredientFactory();
		if(item.equals("cheese")){
			pizza	=	new CheesePizza(ingredientFacotry);
			pizza.setName("New york Style Cheese Pizza");
		}else if(item.equals("veggie")){
			pizza	=	new VeggiePizza(ingredientFactory);
			pizza.setName(("NewYork Style Veggie Pizza");
		}
		else if (item.equals("clam")){
			pizza	=	new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		else if(item.equals("pepperoni")){
			pizza	=	new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		 return pizza;
		
	}
	public Pizza createPizza(String type){
		if(type.equals("cheese")){
			return	new NYStyleCheesePizza();
			
		}
		else if(type.equals("pepperoni")){
			return	new NYStylePepperoni();
		}
		else if(type.equals("clam")){
			return	new NYStyleClamPizza();
		}
		else if(type.equals("veggie")){
			return	new NYStyleVeggiePizza();
		}
		else return null;
	}

}
