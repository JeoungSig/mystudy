package headfirst.templatemethod.barista;

public abstract class CaffeineBeverage {

	// 서브클래스에서 Override할수 없도록 final로 선언한다.
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
