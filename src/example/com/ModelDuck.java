package example.com;

public class ModelDuck extends Duck{
   public ModelDuck(){
	   this.setFlyBehavior(new FlyNoWay());
	   this.setQuackBehavior(new Quack());
   }
   public void display(){
	   System.out.println("I'm a model duck");
   }
}
