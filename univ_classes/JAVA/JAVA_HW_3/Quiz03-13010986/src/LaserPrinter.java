class LaserPrinter extends Printer {
	static final int amountOfTonerToPrint = 10;
	private int amountOfToner;
	public LaserPrinter(String modelName, String manufacturer, int type, int numberOfPaper, int amountOfToner) {
		super(modelName, manufacturer, type, numberOfPaper);
		this.amountOfToner = amountOfToner;
	}

	public int getAmountOfToner() {
		return amountOfToner;
	}
	
	@Override
	public boolean print() {
		if (amountOfToner <= 0) {
			System.out.println("��ʰ� �����մϴ�.");
			return false;
		}
		if (this.getNumberOfPaper() <= 0) {
			System.out.println("�μ� ������ �����մϴ�.");
			return false;
		}
		System.out.println("������ ������ ���");
		amountOfToner -= amountOfTonerToPrint; // ��� �ܷ� ����
		this.setNumberOfPaper(this.getNumberOfPaper()-1); // ���� ���� �ż� ����
		this.setNumberofPrinted(this.getNumberOfPrinted()+1); // �μ��� ���� �ż� ����
		return true;
	}

}
