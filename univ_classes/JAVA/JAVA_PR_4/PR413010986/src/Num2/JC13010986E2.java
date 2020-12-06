package Num2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseListener;

public class JC13010986E2 extends JFrame {
	
	public JC13010986E2() {
		super("Drawing circle");
		
		DrawPanel draw = new DrawPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(draw);
		this.setSize(400, 400);
		this.setVisible(true);
		
		draw.setFocusable(true);
		draw.requestFocus();
		
		Thread th = new Thread(draw);
		th.start();
	}
	
	public static void main(String[] args) {
		System.out.println("13010986√÷±‚«•");
		new JC13010986E2();
	}
	
	public class DrawPanel extends JPanel implements Runnable {
		private boolean mouseEntered = false;
		
		public DrawPanel() {
			super();
			this.setSize(400, 400);
			this.setLayout(null);
			this.addMouseListener(new MouseEvent());
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			
			if (mouseEntered) {
				int x = (int)(Math.random() * 10000) % 350 + 30;
				int y = (int)(Math.random() * 10000) % 350 + 30;
				int w = (int)(Math.random() * 10000) % 100 + 20;
				int h = (int)(Math.random() * 10000) % 100 + 20;
				g.fillOval(x, y, w, h);
			}
		}
		
		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(300l);
					if (mouseEntered)
						this.repaint();
				} catch (InterruptedException e) {
					System.out.println(e);
					return;
				}
			}
		}
		
		private class MouseEvent implements MouseListener {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent arg0) {
				mouseEntered = true;
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent arg0) {
				mouseEntered = false;
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
}
