package Num1;

import java.awt.*;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Vector;

import javax.swing.*;

public class JC13010986E1 extends JFrame {
	
	public JC13010986E1() {
		super("Image Gallery");
		this.setSize(545, 470);
		this.getContentPane().add(new Gallery());
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("13010986√÷±‚«•");
		new JC13010986E1();
	}
	
	public class Gallery extends JPanel {
		
		private JRadioButton left, right;
		private JLabel imageFrame;
		private Vector<ImageIcon> list = new Vector<ImageIcon>();
		private int curIndex = 0;
		
		public Gallery() {
			super();
			
			JPanel upper = new JPanel();
			upper.setSize(545, 15);
			upper.setLayout(new FlowLayout());
			
			left = new JRadioButton("Left");
			right = new JRadioButton("Right");
			left.setSelected(true);
			ButtonGroup grp = new ButtonGroup();
			grp.add(left); grp.add(right);
			
			upper.add(left);
			upper.add(right);
			
			JPanel bottom = new JPanel();
			bottom.setLayout(new GridLayout(1,1));
			bottom.setSize(545,450);
			
			File[] imageList = (new File("images")).listFiles();
			for (File imgFile : imageList) {
				list.add(new ImageIcon(imgFile.getPath()));
			}
			
			imageFrame = new JLabel();
			imageFrame.addMouseListener(new MouseEvent());
			if (list.size() > 0)
				imageFrame.setIcon(list.get(0));
			
			bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
			bottom.add(imageFrame);
			
			this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			this.add(upper);
			this.add(bottom);
		}
		
		
		private class MouseEvent implements MouseListener {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent arg0) {
				if (list.size() == 0) return;
				if (left.isSelected()) {
					curIndex -= 1;
					if (curIndex == -1) curIndex = list.size() - 1;
				} else if (right.isSelected()) {
					curIndex = (curIndex + 1) % list.size();
				}
				imageFrame.setIcon(list.get(curIndex));
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
	
}
