public class RectManager {
	public static void main(String args[]) {
		JC13010986Q0202 r = new JC13010986Q0202();
		JC13010986Q0202 s = new JC13010986Q0202(1,1,2,3);
    
		r.show();
		s.show();
		System.out.println(s.square());

		r.set(-2,2,-1,4); 
		r.show();

		System.out.println(r.square());

		if (r.equals(s))
			System.out.println("�� �簢���� ���ο� ���ΰ� �����ϴ�.");
		else System.out.println(" �� �簢���� ���ο� ���ΰ� �ٸ��ϴ�.");
	}
}