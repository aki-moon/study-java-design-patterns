package dessignpattern.abstractfactory.tablefactory;

import dessignpattern.abstractfactory.factory.Factory;
import dessignpattern.abstractfactory.factory.Link;
import dessignpattern.abstractfactory.factory.Page;
import dessignpattern.abstractfactory.factory.Tray;

public class TableFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
