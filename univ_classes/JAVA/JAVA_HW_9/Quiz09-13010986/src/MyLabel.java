import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyLabel extends JLabel implements Runnable {
	private int barSize = 0;
	private int maxBarSize;
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
		this.addKeyListener(new KeyEvent());
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int) (((double)(this.getWidth())) / maxBarSize * barSize);
		if (width == 0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(200l);
				this.consume();
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
	synchronized public void fill() {
		if (barSize == maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				return;
			}
		}
		
		barSize++;
		repaint();
		notify();
	}
	
	synchronized public void consume() {
		if (barSize == 0) {
			try {
				wait();
			} catch (InterruptedException e ) {
				return;
			}
		}
		barSize--;
		repaint();
		notify();
	}
	
	private class KeyEvent implements KeyListener {

		@Override
		public void keyPressed(java.awt.event.KeyEvent arg0) {
			fill();
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
