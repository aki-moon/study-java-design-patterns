package memento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {
	public static final String SAVEFILENAME = "game.dat";

	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = loadMemento();
		for (int i = 0; i < 100; i++) {
			System.out.println("=== " + i);
			System.out.println("現状:" + gamer);

			gamer.bet();

			System.out.println("所持金は" + gamer.getMoney() + "円になりました");

			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("   (大分増えたので、現在の状態を保存しておこう)");
				memento = gamer.createMemento();
				saveMemento(memento);
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("   (大分減ったので、以前の状態に復帰しよう");
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("");

		}

	}

	private static void saveMemento(Memento memento) {
		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
			out.writeObject(memento);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Memento loadMemento() {
		Memento memento = null;
		ObjectInput in;
		try {
			in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
			memento = (Memento) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return memento;
	}

}
