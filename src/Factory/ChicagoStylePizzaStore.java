package Factory;

public class ChicagoStylePizzaStore extends PizzaStore{
	Pizza pizza;
	
	public Pizza createPizza(String type){
		if(type.equals("cheese")){
			return	new ChicagoStyleCheesePizza();			
		}
		else if(type.equals("pepperoni")){
			return	new ChicagoStylePepperoni();
		}
		else if(type.equals("clam")){
			return	new ChicagoStyleClamPizza();
		}
		else if(type.equals("veggie")){
			return	new ChicagoStyleVeggiePizza();
		}
		else return null;
	}
}
