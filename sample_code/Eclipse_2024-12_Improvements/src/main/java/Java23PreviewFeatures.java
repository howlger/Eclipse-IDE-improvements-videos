//import module java.desktop; // JEP 476: Module Import Declarations (Preview)
//
//public class Java23PreviewFeatures extends JFrame {
//
//	public Java23PreviewFeatures(String title) {
//		if (title == null) throw new NullPointerException();
//		super(); // JEP 482: Flexible Constructor Bodies (Second Preview)
//		setTitle(title);
//		setSize(400, 100);
//		setLocationRelativeTo(null);
//		JButton button = new JButton("Exit");
//		button.addActionListener(_ -> System.exit(0));
//		add(button, BorderLayout.CENTER);
//	}
//
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(
//				() -> new Java23PreviewFeatures("Java 23 Preview Features").setVisible(true));
//	}
//
//}