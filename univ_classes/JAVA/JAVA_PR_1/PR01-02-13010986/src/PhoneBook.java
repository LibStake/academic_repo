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
		
		System.out.print("인원수>>");
		numToAdd = scanner.nextInt();
		
		if (numToAdd <= 0) { scanner.close(); return; }
		for (int i=0; i<numToAdd; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			inName = scanner.next();
			inTel = scanner.next();
			this.phoneList.add(new Phone(inName, inTel));
		}
		
		scanner.close();
		System.out.println("저장되었습니다...");
	}
	
	public void searchPhone() {
		String keyword="";
		Scanner scanner = new Scanner(System.in);
		
		while (!keyword.equals("그만")) {
			System.out.print("검색할 이름>>");
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
