package com.example.samples;

import static javax.swing.SwingUtilities.invokeLater;
import javax.swing.JFrame;
import javax.swing.JLabel;        
 
public class SwingSample extends JFrame {

    SwingSample() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(new JLabel("Hello Swing"));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
    	invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingSample();
			}
		});
    }
}