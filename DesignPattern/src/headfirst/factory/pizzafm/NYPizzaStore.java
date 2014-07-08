package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see headfirst.factory.pizzafm.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else
			return null;
	}
}
