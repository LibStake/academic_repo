class JC13010986Q0202 {
	private int x1, x2, y1, y2 = 0;

	JC13010986Q0202() {}

	JC13010986Q0202(int xx1, int yy1, int xx2, int yy2) {
		if ((xx1 == xx2) || (yy1 == yy2)) return; // Not Rectangle
		this.x1 = xx1; this.x2 = xx2;
		this.y1 = yy1; this.y2 = yy2;
	}

	public void set(int xx1, int yy1, int xx2, int yy2) {
		if ((xx1 == xx2) || (yy1 == yy2)) return; // Not Rectangle
		this.x1 = xx1; this.x2 = xx2;
		this.y1 = yy1; this.y2 = yy2;
	}

	public int square() {
		int size = (x1-x2) * (y1-y2); // ���� ���
		if (size <0)
			size = -size; // ������ ������ ��� ����� ����� ��
		return size;
	}

	public void show() {
		System.out.printf("���簢�� ��ǥ -> (%d, %d), (%d, %d)\n", this.x1, this.y1, this.x2, this.y2);
		System.out.printf("���簢�� ���� -> %d\n", this.square());
	}

	public boolean equals(JC13010986Q0202 x) {
		int width1 = (x.x1>x.x2?(x.x1-x.x2):x.x2-x.x1); // x�� ���� ����
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this�� ���� ����
		int height1 = (x.y1>x.y2?(x.y1-x.y2):(x.y2-x.y1)); // x�� ���� ����
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this�� ���� ����

		return (width1 == width2) && (height1 == height2) &&
				(this.x1 == x.x1) && (this.x2 == x.x2) &&
				(this.y1 == x.y1) && (this.y2 == x.y2); 
	}
}




