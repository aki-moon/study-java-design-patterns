package dessignpattern.singleton.practice;

public class Main {

	public static void main(String[] args) {
		Triple triple0 = Triple.getInstance(0);
		Triple triple1 = Triple.getInstance(1);
		Triple triple2 = Triple.getInstance(2);
		System.out.println(triple0);
		System.out.println(triple1);
		System.out.println(triple2);
	}

}
