
public class RandomArray {
	private int[][] randArr;
	
	public RandomArray() {
		int i, j, cnt=0;
		this.randArr = new int[][] {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
		
		while (cnt < 10) {
			i = (int)(Math.random() * 4);
			j = (int)(Math.random() * 4);
			
			System.out.print("idx " + i + "," + j + ">>");
			
			if (this.randArr[i][j] == 0) {
				randArr[i][j] = (int)(Math.random() * 10 + 1);
				System.out.println(randArr[i][j]);
				cnt += 1;
			} else System.out.println("None-Zero");
		}
	}
	
	public void show() {
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(randArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
