import javax.swing.*;
import java.awt.*;


public class JC13010986Q09 extends JFrame {

	private MyLabel bar = new MyLabel(100);
	
	public JC13010986Q09(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		c.add(bar);
		
		setSize(350, 200);
		setVisible(true);
		
		bar.setFocusable(true);
		bar.requestFocus();
		Thread th = new Thread(bar);
		th.start();
	}
	
	
	public static void main(String[] args) {
		System.out.println("13010986�ֱ�ǥ");
		new JC13010986Q09("�ƹ�Ű�� ���� ���� �� ä���");
	}
}
