public class JC13010986Q0201 {
	public static void main (String[] args) {
		System.out.println("13010986 �ֱ�ǥ");
		
		int intArray[][] = new int[4][]; // �� ���� ���۷��� �迭 ����
		intArray[0] = new int[5]; // ù° ���� ���� 3���� �迭 ����
		intArray[1] = new int[4]; // ��° ���� ���� 2���� �迭 ����
		intArray[2] = new int[3]; // ��° ���� ���� 3���� �迭 ����
		intArray[3] = new int[2]; // ��° ���� ���� 2���� �迭 ����

		for (int i=0; i<intArray.length; i++) // �࿡ ���� �ݺ�
			for (int j=0; j<intArray[i].length; j++) // ���� ���� �ݺ�
				intArray[i][j] = (int)(Math.random() * 100 + 1);

		for (int i=0; i<intArray.length; i++) {
			int rowSum = 0;
			for (int j=0; j<intArray[i].length; j++) {
				rowSum += intArray[i][j];
				System.out.print(intArray[i][j]+" ");
			}
			System.out.print("=> Sum of this row = " + rowSum);
			System.out.println(); // ���� �ٷ� �Ѿ��
		}
	}
}
