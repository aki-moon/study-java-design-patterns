package abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
	protected String title;
	protected String author;
	protected List<Item> content = new ArrayList<Item>();
	public Page(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public void add (Item item) {
		content.add(item);
	}

	public void output() {
		String fileName = title + ".html";
		try {
			Writer writer = new FileWriter(fileName);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(fileName + " を作成しました。");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected abstract String makeHTML();


}
