import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JC13010986Q07 extends JFrame {
	
	JPanel pnl;
	
	public JC13010986Q07() {
		setTitle("Color Change");
		setSize(300, 300);
		
		pnl = new JPanel();
		pnl.setBackground(Color.GREEN);
		pnl.addMouseListener(new MouseEvent());
		
		this.getContentPane().add(pnl);
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		System.out.println("13010986 √÷±‚«•");
		new JC13010986Q07();
	}
	
	private class MouseEvent implements MouseListener {

		@Override
		public void mouseClicked(java.awt.event.MouseEvent arg0) {
			// TODO Auto-generated method stub
			
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
			pnl.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseReleased(java.awt.event.MouseEvent arg0) {
			// TODO Auto-generated method stub
			pnl.setBackground(Color.GREEN);
		}
		
	}
}
