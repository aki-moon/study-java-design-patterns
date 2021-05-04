package dessignpattern.command;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	private JButton redButton = new JButton("red");
	private JButton greenButton = new JButton("green");
	private JButton blueButton = new JButton("blue");
	private JButton undoButton = new JButton("undo");

	@SuppressWarnings("deprecation")
	public Main(String title) {
		super(title);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		canvas.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				Command command = new DrawCommand(canvas, e.getPoint());
				history.append(command);
				command.execute();
			}
		});

		clearButton.addActionListener(this);
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		undoButton.addActionListener(this);

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(redButton);
		buttonBox.add(greenButton);
		buttonBox.add(blueButton);
		buttonBox.add(undoButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		show();
	}

	public static void main(String[] args) {
		new Main("Command pattern sample");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			history.clear();
			canvas.init();
			canvas.repaint();
		} else if (e.getSource() == redButton) {
			Command command = new ColorCommand(canvas, Color.red);
			history.append(command);
			command.execute();
		} else if (e.getSource() == greenButton) {
			Command command = new ColorCommand(canvas, Color.green);
			history.append(command);
			command.execute();
		} else if (e.getSource() == blueButton) {
			Command command = new ColorCommand(canvas, Color.blue);
			history.append(command);
			command.execute();
		} else if (e.getSource() == undoButton) {
			history.undo();
			canvas.repaint();
		}
	}

}
