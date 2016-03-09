package example.com;

public class MallardDuck extends Duck{
	
	MallardDuck(){
		this.setFlyBehavior(new	FlyWithWings())	;
		this.setQuackBehavior(new	Quack())	;
   }
	public void display(){
		
	}
}
