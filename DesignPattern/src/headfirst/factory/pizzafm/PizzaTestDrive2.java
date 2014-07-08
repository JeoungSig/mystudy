package headfirst.factory.pizzafm;

public class PizzaTestDrive2 {

	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else

			if (type.equals("vegggi")) {
				pizza = new NYStyleVeggiePizza();
			}

		} else if (style.equals("Chicago")) {

		}
		return pizza;
	}
}
