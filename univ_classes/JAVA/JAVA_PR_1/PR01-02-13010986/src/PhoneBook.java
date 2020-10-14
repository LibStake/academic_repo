import java.util.*;

public class PhoneBook {
	private int numPhones;
	private Phone[] phoneList;
	
	private Scanner scanner;
	
	public PhoneBook() {
		
	}
	
	private void addPhones() {
		int numToAdd = 0;
		String inName = "", inTel = "";
		
		System.out.print("�ο���>>");
		numToAdd = this.scanner.nextInt();
		
		if (numToAdd <= 0) return;
		
		this.numPhones = numToAdd;
		this.phoneList = new Phone[numToAdd];
		
		for (int i=0; i<this.numPhones; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			inName = this.scanner.next();
			inTel = this.scanner.next();
			this.phoneList[i] = new Phone(inName, inTel);
		}
		
		System.out.println("����Ǿ����ϴ�...");
	}
	
	private void searchPhone() {
		String keyword="";
		
		while (true) {
			System.out.print("�˻��� �̸�>>");
			keyword = this.scanner.next();
			if (keyword.equals("�׸�")) break;
			this.search(keyword);
		}
	}
	
	private void search(String k) {
		boolean found = false;
		for (int i=0; i<this.numPhones; i++) {
			if (k.equals(this.phoneList[i].getName())) {
				this.phoneList[i].displayInfo();
				found = true;
			}
		}
		if (!found) System.out.println(k + "�� �����ϴ�.");
	}
	
	public void run() {
		this.scanner = new Scanner(System.in);
		this.addPhones();
		if (this.numPhones > 0) this.searchPhone();
		this.scanner.close();
	}
}
