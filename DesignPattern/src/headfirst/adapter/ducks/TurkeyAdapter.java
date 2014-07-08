package headfirst.adapter.ducks;

/**
 * 칠면조를 위한 어댑터 클래스
 * 
 * @author Steven J.S Min
 * 
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	/**
	 * 오리의 행동으로 칠면조행동을 변환하기위한 칠면조 Reference를 받는다.
	 * 
	 * @param turkey
	 */
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	/*
	 * 오리의 행동으로 칠면조에게 역할을 위임한다.
	 * 
	 * @see headfirst.adapter.ducks.Duck#quack()
	 */
	public void quack() {
		turkey.gobble();
	}

	/*
	 * 오리의 행동으로 칠면조에게 역할을 위임한다.
	 * 
	 * @see headfirst.adapter.ducks.Duck#fly()
	 */
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
