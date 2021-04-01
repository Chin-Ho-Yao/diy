package openHome;

public class Ocean {
	public static void main(String[] args) {
		doSwim(new Anemonefish("尼莫"));
		doSwim(new Shark("蘭尼"));
		doSwim(new Human("賈斯丁"));
		doSwim(new Submarine("黃色一號"));
		doSwim(new SeaPlane("空軍一號"));
		doSwim(new FlyingFish("慎平"));
		
	}
	static void doSwim(Swimmer swimmer) {
		swimmer.swim();
	}
}
