package openHome;

public class SeaPlane implements Swimmer, Fly {

	private String name;

	public SeaPlane(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.printf("海上飛機 %s 在飛%n", name);

	}

	@Override
	public void swim() {
		System.out.printf("海上飛機 %s 在海面航行%n", name);

	}

}
