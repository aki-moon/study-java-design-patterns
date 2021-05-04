package dessignpattern.abstractfactory;

import dessignpattern.abstractfactory.factory.Factory;
import dessignpattern.abstractfactory.factory.Link;
import dessignpattern.abstractfactory.factory.Page;
import dessignpattern.abstractfactory.factory.Tray;

public class Main {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("Usage : java Main class.name.of.ConcreateFactory");
			System.out.println("Example1 : java Main listfactory.ListFactory");
			System.out.println("Example2 : java Main tableFactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);

		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");

		Link excite = factory.createLink("Excite", "http://www.excite.com");
		Link google = factory.createLink("Google", "http://www.google.com");

		Tray traynews = factory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);

		Tray trayYahoo = factory.createTray("Yahoo");
		trayYahoo.add(us_yahoo);
		trayYahoo.add(jp_yahoo);

		Tray traySearch = factory.createTray("サーチエンジン");
		traySearch.add(trayYahoo);
		traySearch.add(excite);
		traySearch.add(google);

		Page page = factory.createPage("LinkPage", "author");
		Page page2 = factory.createYahooPage();
		page.add(traynews);
		page.add(traySearch);
		page2.output();
		page.output();
	}

}
