package Num2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JC13010986E2 extends JFrame {
	
	private JLabel lbl;
	private Point pos;
	
	public JC13010986E2() {
		setTitle("클릭 연습 용 응용프로그램");
		setSize(300, 300);
		
		JPanel pnl = new JPanel();
		this.getContentPane().add(pnl);
		
		pos = new Point(100, 100);
		lbl = new JLabel("C");
		lbl.setSize(10, 10);
		lbl.setOpaque(true);
		lbl.setLocation(pos);
		
		pnl.setLayout(null);
		pnl.add(lbl);
		
		pnl.addMouseListener(new MouseEvent());
		setVisible(true);
	}
	
	public static void main(String [] args) {
		System.out.println("13010986 최기표");
		new JC13010986E2();
	}
	
	private void setPosition(Point p) {
		this.lbl.setLocation(p);
		System.out.println("<< (" + this.lbl.getLocation().x + "," + this.lbl.getLocation().y + ")");
	}
	
	private class MouseEvent implements MouseListener {
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			System.out.println(">> (" + e.getPoint().x + "," + e.getPoint().y + ")");
			setPosition(e.getPoint());
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(java.awt.event.MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
