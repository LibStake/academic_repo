package Num2;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void print() {
		System.out.println(color + "색의 (" + this.getX() + "," + this.getY() + ")의 점입니다.");
	}
}
