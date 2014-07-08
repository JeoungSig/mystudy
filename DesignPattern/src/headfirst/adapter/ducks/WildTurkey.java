package headfirst.adapter.ducks;

public class WildTurkey implements Turkey {
	/* (non-Javadoc)
	 * @see headfirst.adapter.ducks.Turkey#gobble()
	 */
	public void gobble() {
		System.out.println("Gobble gobble");
	}
 
	/* (non-Javadoc)
	 * @see headfirst.adapter.ducks.Turkey#fly()
	 */
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
