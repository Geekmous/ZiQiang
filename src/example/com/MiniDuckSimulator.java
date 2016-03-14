package example.com;

public class MiniDuckSimulator {
	  
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
			
        Duck model = new	ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
			
        Duckcall duckcall = new	Duckcall();
        duckcall.setQuackBehavior(new Quack());
        duckcall.performQuack();
    }
}
