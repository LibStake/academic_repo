import java.util.*;

public class PhoneBook {
	private ArrayList<Phone> phoneList;
	
	public PhoneBook() {
		this.phoneList = new ArrayList<Phone>();
	}
	
	public void addPhones() {
		Scanner scanner = new Scanner(System.in);
		int numToAdd = 0;
		String inName = "", inTel = "";
		
		System.out.print("�ο���>>");
		numToAdd = scanner.nextInt();
		
		if (numToAdd <= 0) { scanner.close(); return; }
		for (int i=0; i<numToAdd; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			inName = scanner.next();
			inTel = scanner.next();
			this.phoneList.add(new Phone(inName, inTel));
		}
		
		scanner.close();
		System.out.println("����Ǿ����ϴ�...");
	}
	
	public void searchPhone() {
		String keyword="";
		Scanner scanner = new Scanner(System.in);
		
		while (!keyword.equals("�׸�")) {
			System.out.print("�˻��� �̸�>>");
			keyword = scanner.next();
			this.search(keyword);
		}
		scanner.close();
	}
	
	private void search(String k) {
		for (int i=0; i<this.phoneList.size(); i++) {
			if (k.equals(this.phoneList.get(i).getName()))
				this.phoneList.get(i).displayInfo();
		}
	}
}
