package dessignpattern.singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("start");
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 == singleton2) {
			System.out.println("singleton1とsingleton2は同じインスタンスです");
		} else {
			System.out.println("singleton1とsingleton2は違うインスタンスです");
		}
		System.out.println("end");
	}

}
