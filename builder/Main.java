package dessignpattern.builder;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if (args[0].equals("Plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			String filename = htmlBuilder.getResult();
			System.out.println(filename + "が作成されました");
		} else if (args[0].equals("GUI")) {
			FrameBuilder frameBuilder = new FrameBuilder();
			Director director = new Director(frameBuilder);
			director.construct();
			JFrame frame = frameBuilder.getResult();
			frame.setVisible(true);
		}
			else {
			usage();
			System.exit(0);
		}
	}

	private static void usage() {
		System.out.println("Usage : java Main plain    ブレーンテキストで文書作成");
		System.out.println("Usage : java Main html    HTMLファイルで文書作成");
		System.out.println("Usage : java Main GUI    GUIで文書作成");
	}
}
