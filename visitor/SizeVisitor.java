package dessignpattern.visitor;

import java.util.Iterator;

public class SizeVisitor extends Visitor{
	private int size = 0;


	@Override
	public void visit(File file) {
		size += file.getSize();
	}

	@Override
	public void visit(Directory directory) {
		Iterator<?> iterator = directory.irerator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			entry.accept(this);
		}
	}

	public int getSize() {
		return size;
	}

}
