package dessignpattern.composite;

import java.util.ArrayList;

public class Directory extends Entry {
	private String name;
	private ArrayList<Entry> directory = new ArrayList<Entry>();

	public Directory(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Entry entry : directory) {
			size += entry.getSize();
		}
		return size;
	}

	public Entry add(Entry entry) {
		directory.add(entry);
		entry.parent = this;
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		for (Entry entry : directory) {
			entry.printList(prefix + "/" + name);
		}
	}

}
