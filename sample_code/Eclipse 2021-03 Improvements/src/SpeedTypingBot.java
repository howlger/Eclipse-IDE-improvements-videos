import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Robot;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SpeedTypingBot {

	private static final String DEFAULT_TEXT = "new arraylist";
	private static final String DEFAULT_LOCATION = "800,200";
	private static final int DEFAULT_CHARS_PER_SECOND = 20;
	private static final String BUTTON_LABEL = "        type        ";

	public static void main(String[] args) throws Exception {
		new ControlWindow();
	}

	private static void type(String text, String at, String charsPerSecond, Button button) {
		try {
			button.setLabel("");
			if (at.indexOf(',') < 0) return;
			String[] location = at.split(",", 2);
			for (int i = 0; i < location.length; i++) {
				String string = location[i];
				System.out.println(i + ". " + string);
			}
			int x= Integer.parseInt(location[0].trim());
			int y= Integer.parseInt(location[1].trim());
			int delay= 1000 / Integer.parseInt(charsPerSecond.trim());

			Robot robot = new Robot();
			robot.mouseMove(x, y);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			for (int i = 0; i < text.length(); i++) {
				robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(text.charAt(i)));
				button.setLabel(button.getLabel() + text.charAt(i));
				robot.delay(delay);
			}
			button.setLabel(BUTTON_LABEL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static class ControlWindow extends Frame {
		public ControlWindow() {
			setTitle("Speed Typing Bot");
	        addWindowListener(new WindowAdapter(){
	            public void windowClosing(WindowEvent e) {
	                dispose();
	            }
	        });

	        // text
	        add(new Label("Text: ", Label.RIGHT));
			TextField text= new TextField(DEFAULT_TEXT, 3);
			add(text);

			// x,y
			add(new Label("x,y: ", Label.RIGHT));
			TextField at= new TextField(DEFAULT_LOCATION, 2);
			add(at);

			// chars/s
			add(new Label("chars/s: ", Label.RIGHT));
			TextField speed = new TextField("" + DEFAULT_CHARS_PER_SECOND, 1);
			add(speed);

			Button go= new Button(BUTTON_LABEL);
			add(go);
			go.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e){
		            type(text.getText(), at.getText(), speed.getText(), go);
		        }
		    });
			add(new Label(""));

			FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 0, 4);
			layout.setAlignOnBaseline(true);
			setLayout(layout);
			pack();
			setVisible(true);
		}
	}

}
