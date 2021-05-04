package dessignpattern.singleton.practice;

public class Triple {
	private static Triple[] tripleArray = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)
	};

	private Triple(int i) {
		System.out.println("create instance " + i + ".");
	}

	public static Triple getInstance(int i) {
		return tripleArray[i];
	}
}
