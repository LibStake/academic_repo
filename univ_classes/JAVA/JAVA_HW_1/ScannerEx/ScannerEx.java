// Quiz0201_13010986
import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("�ֱ�ǥ 13010986");

		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int inputCounter = 0;
		
		String name = scanner.next(); // ���ڿ� �б�
		inputCounter++;
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next(); // ���ڿ� �б�
		inputCounter++;
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt(); // ���� �б�
		inputCounter++;
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble(); // �Ǽ� �б�
		inputCounter++;
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean isSingle = scanner.nextBoolean(); // ���� �б�
		inputCounter++;
		System.out.println("���� ���δ� " + isSingle + "�Դϴ�.");
		
		scanner.close(); // scanner ��ü �ݱ�*/

		System.out.println("�� " + inputCounter + "���� �����Ͱ� �Է� �Ǿ����ϴ�.");
	}
}