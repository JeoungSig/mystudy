package headfirst.strategy;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		// MallardDuck는 Duck으로 부터 확장되었으며 Duck에는 행동(날다, 소리내다)을
		// 위임 받을수 있는 (추상) 객체변를 가지고있다.
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		// 실행중에 새로 위임받은 행동을 지정하여 행동을 변경할 수 있다.
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
