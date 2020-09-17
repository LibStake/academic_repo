// Quiz0202_13010986
import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		System.out.println("13010986 최기표");

		char grade;
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); // 점수 읽기
		if(score >= 95) // score가 95 이상
			grade = 'A';
		else if(score >= 75) // score가 75 이상 95 미만
			grade = 'B';
		else if(score >= 60) // score가 60 이상 75 미만
			grade = 'C';
		else if(score >= 45) // score가 45 이상 60 미만
			grade = 'D';
		else // score가 45 미만
			grade = 'F';
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();
	}
}