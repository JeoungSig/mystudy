package headfirst.factory.pizzas;

public class Test {

	public Pizza orderPizza(String type) {
		Pizza pizza;

		// 피자종류별 피자를 생성한다.
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
