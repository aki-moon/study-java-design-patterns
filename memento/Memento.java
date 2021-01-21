package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	int money;
	List<String> fruits;

	public int getMoney() {
		return money;
	}

	public Memento(int money) {
		super();
		this.money = money;
		this.fruits = new ArrayList<String>();
	}

	void addFruit(String fruit) {
		fruits.add(fruit);
	}

	List<String> getFruits() {
		return fruits;
	}

}
