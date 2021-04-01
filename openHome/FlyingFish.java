package openHome;

public class FlyingFish extends Fish implements Fly{

	public FlyingFish(String name) {
		super(name);
		
	}

	@Override
	public void swim() {
		System.out.printf("飛魚 %s 游泳%n", name);
		
	}

	@Override
	public void fly() {
		System.out.printf("飛魚 %s 在飛%n", name);
		
	}

}
