package headfirst.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see headfirst.strategy.Duck#display()
	 */
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
