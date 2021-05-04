package dessignpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
	private String fileType;
	private List<File> found = new ArrayList<File>();

	public FileFindVisitor(String fileType) {
		this.fileType = fileType;
	}

	public Iterator<File> getFoundFiles() {
		return found.iterator();
	}

	@Override
	public void visit(File file) {
		if (file.getName().endsWith(fileType)) {
			found.add(file);
		}
	}

	@Override
	public void visit(Directory directory) {
		Iterator<?> iterator = directory.irerator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			entry.accept(this);
		}
	}
}
