package Num1;

public class PrintShop {
	private char letter;
	private int count;
	
	public PrintShop() {
		letter = '#';
		count = 5;
	}
	public PrintShop(char l) {
		letter = l;
		count = 5;
	}
	public PrintShop(char l, int cnt) {
		letter = l;
		count = cnt;
	}
	
	private void putBlock(boolean reverse) {
		if (!reverse) {
			for (int i=0; i<count; i++) {
				for (int j=0; j<=i; j++)
					System.out.print(letter);
				System.out.println();
			}
		} else {
			for (int i=count; i>0;i--) {
				for (int j=0; j<i; j++) 
					System.out.print(letter);
				System.out.println();
			}
		}
	}
	
	public void print() {
		putBlock(false);
	}
	
	public void print(int num) {
		boolean reverse = false;
		for (int i=0; i<num; i++) {
			putBlock(reverse);
			reverse = !reverse;
		}
	}
	
	public void printReverse(int num) {
		boolean reverse = true;
		for (int i=0; i<num; i++) {
			putBlock(reverse);
			reverse = !reverse;
		}
	}
}
