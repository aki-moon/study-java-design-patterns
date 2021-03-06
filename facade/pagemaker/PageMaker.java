package dessignpattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
	private PageMaker() {
	}

	public static void makeWelcomePage(String mailAddress, String fileName) {
		try {
			Properties mailProperties = DataBase.getProperties("maildata");
			String userName = mailProperties.getProperty(mailAddress);
			HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
			writer.title("Welcome to " + userName + "'s page!");
			writer.paragraph(userName + "のページへようこそ。");
			writer.paragraph("メール待っていますね。");
			writer.mailto(mailAddress, userName);
			writer.close();
			System.out.println(fileName + " is created for " + mailAddress + " (" + userName + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <E> void makeLinkPage(String fileName) {
		try {
			HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(fileName));
			htmlWriter.title("Link page");
			Properties mailProp = DataBase.getProperties("maildata");
			Enumeration<?> enumeration = mailProp.propertyNames();
			while(enumeration.hasMoreElements()) {
				String mailAddress = (String) enumeration.nextElement();
				String userName = mailProp.getProperty(mailAddress, "(unknown)");
				htmlWriter.mailto(mailAddress, userName);
			}
			htmlWriter.close();
			System.out.println(fileName + "is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
