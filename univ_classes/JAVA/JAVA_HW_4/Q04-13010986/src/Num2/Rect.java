package Num2;

class Rect {
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width; 
		this.height = height;
	}
	public boolean equals(Object obj) { // �簢�� ���� ��
		Rect p = (Rect)obj; // obj�� Rect Ÿ������ �ٿ�ĳ����
		if (width*height == p.width*p.height) return true;
		else return false;
	}
}
