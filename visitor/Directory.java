package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry{
	private String name;
	private List<Entry> directory = new ArrayList<Entry>();

	public Directory(String name) {
		super();
		this.name = name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		SizeVisitor sizeVisitor = new SizeVisitor();
		accept(sizeVisitor);
		return sizeVisitor.getSize();
	}

	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	public Iterator<Entry> iterator() {
		return directory.iterator();
	}

}
