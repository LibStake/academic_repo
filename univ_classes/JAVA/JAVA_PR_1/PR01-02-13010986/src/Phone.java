
public class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() { return name; }
	public String getTel() { return tel; }
	
	public void displayInfo() {
		System.out.println(this.name + "�� ��ȣ�� " + this.tel + " �Դϴ�.");
	}
}
