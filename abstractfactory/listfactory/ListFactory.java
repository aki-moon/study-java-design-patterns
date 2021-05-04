package dessignpattern.abstractfactory.listfactory;

import dessignpattern.abstractfactory.factory.Factory;
import dessignpattern.abstractfactory.factory.Link;
import dessignpattern.abstractfactory.factory.Page;
import dessignpattern.abstractfactory.factory.Tray;

public class ListFactory extends Factory{

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption,url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
