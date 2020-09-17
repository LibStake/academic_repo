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
		int size = (x1-x2) * (y1-y2); // 면적 계산
		if (size <0)
			size = -size; // 면적이 음수인 경우 양수로 만들어 줌
		return size;
	}

	public void show() {
		System.out.printf("직사각형 좌표 -> (%d, %d), (%d, %d)\n", this.x1, this.y1, this.x2, this.y2);
		System.out.printf("직사각형 넓이 -> %d\n", this.square());
	}

	public boolean equals(JC13010986Q0202 x) {
		int width1 = (x.x1>x.x2?(x.x1-x.x2):x.x2-x.x1); // x의 가로 길이
		int width2 = (x1>x2?(x1-x2):(x2-x1)); // this의 가로 길이
		int height1 = (x.y1>x.y2?(x.y1-x.y2):(x.y2-x.y1)); // x의 세로 길이
		int height2 = (y1>y2?(y1-y2):(y2-y1)); // this의 세로 길이

		return (width1 == width2) && (height1 == height2) &&
				(this.x1 == x.x1) && (this.x2 == x.x2) &&
				(this.y1 == x.y1) && (this.y2 == x.y2); 
	}
}




