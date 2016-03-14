package example.com;

public class Duckcall {
    QuackBehavior quackBehavior = null;
    
    Duckcall(){  
    }
	
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
	
    public void performQuack() {
        this.quackBehavior.quack();
    }
}
