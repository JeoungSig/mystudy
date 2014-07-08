package headfirst.factory.pizzafm;

public abstract class PizzaStore {
 
	// 실제로 피자를 만드는것은 하위 클래스에서 만든다.
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
