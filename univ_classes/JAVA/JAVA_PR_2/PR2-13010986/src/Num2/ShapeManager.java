package Num2;

import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class ShapeManager {
	private Scanner scanner = new Scanner(System.in);	
	private Vector<Shape> list = new Vector<Shape>();
	
	public void run() {
		int buf;
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			buf = scanner.nextInt();
			
			if (buf == 1) {
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				this.addOne(scanner.nextInt());
			} else if (buf == 2) {
				System.out.print("삭제할 도형의 위치>>");
				this.removeOne(scanner.nextInt());
			} else if (buf == 3)
				this.listUp();
			else if (buf == 4)
				return;
			else
				continue;
		}
	}
	
	private void addOne(int sel) {
		switch (sel) {
		case 1:
			this.list.add(new Line());
			break;
		case 2:
			this.list.add(new Rect());
			break;
		case 3:
			this.list.add(new Circle());
			break;
		}
	}
	
	private void removeOne(int sel) {
		if (sel > this.list.size() || sel <= 0) {
			System.out.println("삭제할 수 없습니다.");
			return;
		}
		list.remove(sel-1);
	}
	
	private void listUp() {
		Iterator<Shape> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next().toString());
	}
}
