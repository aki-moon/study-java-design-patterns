package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String currentDirectory = "";

	public ListVisitor() {
		super();
	}

	@Override
	public void visit(File file) {
		System.out.println(currentDirectory + "/" + file);
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(currentDirectory + "/" + directory);
		String saveDirectory = currentDirectory;
		currentDirectory = currentDirectory + "/" + directory.getName();
		Iterator<?> iterator = directory.irerator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			entry.accept(this);
		}
		currentDirectory = saveDirectory;
	}

}
