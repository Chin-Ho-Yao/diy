package openHome;

public class Submarine implements Swimmer{

	private String name;
	public Submarine(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public void swim() {
		System.out.printf("潛水艇 %s 游泳%n",name);
	}

}
