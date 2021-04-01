import java.awt.CardLayout;
import java.util.Arrays;
import java.util.Scanner;

class CashCard {
	private String number;
	private int bonus;
	private int balance;
	
	public String getNumber() {
		return this.number;
	}
	public int getBonus() {
		return this.bonus;
	}
	public int getBalance() {
		return this.balance;
	}

	CashCard(String number, int bonus, int balance) {

		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}

	void store(int money) {
		if (money > 0) {
			this.balance += money;
			if (money > 1000) {
				this.bonus++;
			}
		} else {
			System.out.println("儲值是負的？你是來亂的嗎？");
		}
	}
	void charge(int money) {
		if (money > 0) {
			if (money < this.balance) {
				this.balance -= money;
			}
		} else {
			System.out.println("扣負數？這不是叫我儲值嗎？？");
		}
	}
	int exchange(int bonus) {
		if (bonus > 0) {
			this.bonus -= bonus;
		}
		return this.bonus;
	}
	
}

public class CardApp {
	public static void main(String[] args) {
		CashCard[] cards = {
				new CashCard("A001", 500, 0),
				new CashCard("A002", 1000, 1),
				new CashCard("A003", 2000, 2)
		};
		Scanner scanner = new Scanner(System.in);
		for (CashCard card : cards) {
			
			System.out.printf("為 (%s, %d, %d)儲值：",card.getNumber(), card.getBalance(), card.getBonus());
			card.store(scanner.nextInt());
			System.out.printf("明細 (%s, %d, %d)：%n",card.getNumber(), card.getBalance(), card.getBonus());
		}
	}
}
