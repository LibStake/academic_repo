import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JC13010986Q08 extends JFrame {
	JTextField txtField;
	JComboBox<String> cmbBox;
	
	public static void main(String [] args) {
		System.out.println("13010986√÷±‚«•");
		new JC13010986Q08();
	}
	
	JC13010986Q08() {
		super("JC13010986Q08-Combobox");
		this.setSize(400, 200);
		
		JPanel pnl = new JPanel();
		this.getContentPane().add(pnl);
		
		FlowLayout layout = new FlowLayout();
		pnl.setLayout(layout);
		
		txtField = new JTextField("");
		txtField.setPreferredSize(new Dimension(140, 30));
		txtField.addKeyListener(new KeyEvent());
		
		cmbBox = new JComboBox<String>();
		cmbBox.setPreferredSize(new Dimension(100, 30));
		
		pnl.add(txtField);
		pnl.add(cmbBox);
		
		this.setVisible(true);
	}
	
	private class KeyEvent implements KeyListener {

		@Override
		public void keyPressed(java.awt.event.KeyEvent arg0) {
			// TODO Auto-generated method stub
			if (arg0.getKeyCode() == 10) {
				String in = txtField.getText();
				if (in.isBlank()) return;
				cmbBox.addItem(in);
				txtField.setText("");
			}
		}

		@Override
		public void keyReleased(java.awt.event.KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(java.awt.event.KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
