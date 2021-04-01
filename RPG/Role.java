package RPG;
public class Role {
	
	protected String name;
	protected int blood;
	protected int level;
	public void fight() {};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String toString() {
		return String.format("（%s, %d, %d）", this.name, this.level, this.blood);
	}
	


}
