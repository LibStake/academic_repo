package Num1;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JC13010986E1 extends JFrame {
	
	public JC13010986E1() {
		setTitle("Random Labels");
		setSize(300, 300);
		this.setLayout(null);
		setVisible(true);
		for (int i=0; i<20; i++)
			drawLabel();
	}
	
	public static void main(String [] args) {
		System.out.println("13010986 ÃÖ±âÇ¥");
		
		JC13010986E1 mainFrame = new JC13010986E1();
	}
	
	private void drawLabel() {
		JLabel lbl = new JLabel();
		int x = (int)(Math.random()*200) + 50;
		int y = (int)(Math.random()*200) + 50;
		
		lbl.setLocation(x, y);
		lbl.setSize(10, 10);
		lbl.setOpaque(true);
		lbl.setBackground(Color.blue);
		
		this.getContentPane().add(lbl);
	}
}
