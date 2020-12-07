package Num1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JT13010986_E1 extends JFrame {
	
	private JButton btn;
	private JPanel up, bot;
	private JLabel lbl;
	
	public static void main(String[] args) {
		System.out.println("13010986최기표");
		new JT13010986_E1();
	}
	
	public JT13010986_E1() {
		super("버튼에 Mouse 이벤트");
		
		this.setSize(400, 400);
		
		up = new JPanel();
		up.setSize(400, 50);
		up.setBackground(Color.yellow);
		up.setLayout(new FlowLayout(FlowLayout.CENTER));
		btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.yellow);
		up.add(btn);
		
		bot = new JPanel();
		bot.setSize(400, 350);
		lbl = new JLabel("hello");
		bot.add(lbl); lbl.setVisible(false);
		
		MouseEvent evt = new MouseEvent();
		btn.addMouseListener(evt);
		bot.addMouseListener(evt);
		this.getContentPane().add(up);
		this.getContentPane().add(bot);
		this.setVisible(true);
	}
	
	
	private class MouseEvent implements MouseListener {

		@Override
		public void mouseClicked(java.awt.event.MouseEvent arg0) {
			if (arg0.getComponent() == bot) {
				lbl.setLocation(arg0.getPoint());
				if (!lbl.isVisible()) lbl.setVisible(true);
			}
		}

		@Override
		public void mouseEntered(java.awt.event.MouseEvent arg0) {
			if (arg0.getComponent() == btn) {
				btn.setBackground(Color.red);
				up.setBackground(Color.red);
			}
		}

		@Override
		public void mouseExited(java.awt.event.MouseEvent arg0) {
			if (arg0.getComponent() == btn) {
				btn.setBackground(Color.yellow);
				up.setBackground(Color.yellow);
			}
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
