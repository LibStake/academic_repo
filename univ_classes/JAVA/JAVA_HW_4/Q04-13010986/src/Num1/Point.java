package Num1;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;	// ��ü obj�� Point Ÿ������ �ٿ� ĳ����
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}
