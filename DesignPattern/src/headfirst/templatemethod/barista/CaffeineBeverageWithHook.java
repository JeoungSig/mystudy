package headfirst.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {

	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	// 후크메소드
	// 서브클래스에서 다양한 목적으로 새로 Override하여 상위 로직에 참여할 수 있다.
	boolean customerWantsCondiments() {
		return true;
	}
}
