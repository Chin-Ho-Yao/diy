package RPG;

public class SwordsMan extends Role {
	public void fight() {

		System.out.println("揮劍攻擊");
	}

	public String toString() {
		return "劍士 " + super.toString();
	}

}