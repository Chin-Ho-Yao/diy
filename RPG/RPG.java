package RPG;

// https://openhome.cc/Gossip/Java/Inheritance.html


public class RPG {
	public static void main(String[] args) {
		demoSwordsMan();
	}

	static void demoSwordsMan() {
		SwordsMan SwordsMan = new SwordsMan();
		Magician Magician = new Magician();
		SwordsMan.setName("Justin");
		SwordsMan.setLevel(1);
		SwordsMan.setBlood(200);
		Magician.setName("Monica");
		Magician.setLevel(1);
		Magician.setBlood(100);
		drawFight(SwordsMan);
		drawFight(Magician);
		System.out.println(SwordsMan.toString());
	}
	
	static void drawFight(Role role) {
		System.out.print(role.getName());
		role.fight();
	}
	
	
}
