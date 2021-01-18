package facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
	private Writer writer;

	public HtmlWriter(Writer writer) {
		super();
		this.writer = writer;
	}

	public void title(String title) throws IOException {
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title>");
		writer.write("</head>");
		writer.write("<body>\n");
		writer.write("<h1>" + title + "</h1>\n");
	}

	public void paragraph(String message) throws IOException {
		writer.write("<p>" + message + "</p>\n");
	}

	public void link(String href, String caption) throws IOException {
		paragraph("<a href=\"" + href +  "\">" + caption + "</a>");
	}

	public void mailto(String mailAddress, String userName) throws IOException {
		link("mailto:" + mailAddress, userName);
	}

	public void close() throws IOException {
		writer.write("</body>");
		writer.write("</html>\n");
		writer.close();
	}

}
