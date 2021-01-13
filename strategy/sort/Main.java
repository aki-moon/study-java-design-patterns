package strategy.sort;

public class Main {
	public static void main(String[] args) {
		String[] data = {
			"Dumpty", "Bowman", "Carroll", "Elfant", "Alice"
		};
		SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
		sap.execute();
		SortAndPrint quicSortAndPrint = new SortAndPrint(data, new QuickSorter());
		quicSortAndPrint.execute();
	}

}
