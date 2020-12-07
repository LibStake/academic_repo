package Num2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JT13010986_E2 extends JFrame {
	private LeftPanel left;
	private RightPanel right;

	public static void main(String[] args) {
		System.out.println("13010986최기표");
		new JT13010986_E2();
	}
	
	public JT13010986_E2() {
		super("13010986최기표");
		
		this.setSize(250,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 1, 12, 12));
		
		left = new LeftPanel();
		con.add(left);
		Thread th1 = new Thread(left);
		
		
		right = new RightPanel();
		con.add(right);
		Thread th2 = new Thread(right);
		
		this.setVisible(true);
		th1.start();
		th2.start();
		
	}

	private class LeftPanel extends JPanel implements Runnable {
		JLabel lblHelo;
		Point pt;
		
		public LeftPanel() {
			setSize(200, 200);
			setBackground(Color.blue);
			lblHelo = new JLabel("hello");
			add(lblHelo);
			addMouseListener(new MouseEvent());
		}
		
		@Override
		public void run() {
			while (true) {
				setLocation();
			}
		}
		
		synchronized void setLocation() {
			if (pt == null) {
				try { wait(); }
				catch (InterruptedException e) { return; }
			}
			lblHelo.setLocation(pt);
		}
		
		synchronized void onClick(Point p) {
			pt = p;
			notify();
		}
		
		private class MouseEvent implements MouseListener {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent arg0) {
				onClick(arg0.getPoint());
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
	
	private class RightPanel extends JPanel implements Runnable {
		JLabel lblCnt;
		int count = 0;
		
		public RightPanel() {
			setSize(200, 200);
			setBackground(Color.yellow);
			lblCnt = new JLabel(Integer.toString(count));
			lblCnt.setSize(30, 30);
			add(lblCnt);
		}
		
		@Override
		public void run() {
			while (true) {
				try { Thread.sleep(1000); }
				catch (InterruptedException e) { return; }
				lblCnt.setText(Integer.toString(++count));
			}
		}
	}
	
}
