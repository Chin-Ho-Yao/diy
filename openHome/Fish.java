package openHome;


public abstract class Fish implements Swimmer {
	protected String name;
	public Fish(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Swimmer swimmer = new Submarine("H");
		Fish Fish = (Fish) swimmer;
	}
	
	public static void doSwim(Fish fish) {
		fish.swim();
	}
	public static void doSwim(Human human) {
		human.swim();
	}
	public static void doSwim(Submarine Submarine) {
		Submarine.swim();
	}
	
}

