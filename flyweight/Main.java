package dessignpattern.flyweight;

public class Main {
	private static BigString[] bigStrings = new BigString[1000];

	public static void main(String[] args) {
		System.out.println("共有した場合");
		testAllocation(true);
		System.out.println("共有しない場合");
		testAllocation(false);

		if(args.length == 0) {
			System.out.println("Usage : java Main digits");
			System.out.println("Example : java Main 1212123");
			System.exit(0);
		}
		BigString bigString = new BigString(args[0]);
		bigString.print();
	}

	private static void testAllocation(boolean shared) {
		for (int i = 0; i < bigStrings.length; i++) {
			bigStrings[i] = new BigString("1212123", shared);
		}
		showMemory();
	}

	private static void showMemory() {
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("使用メモリ" + used);
	}

}
