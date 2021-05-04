package dessignpattern.memento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable{
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
