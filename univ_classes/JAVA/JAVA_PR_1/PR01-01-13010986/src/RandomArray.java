
public class RandomArray {
	private int[][] randArr;
	
	public RandomArray() {
		this.randArr = new int[][] {{0}, {0}, {0}, {0}};
		
		
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
