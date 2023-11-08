package graduate;

public class Graduate extends Student{
	private String assistantType;
	private int scholarshipRate;

	public String getAssistantType() {
		return assistantType;
	}

	public void setAssistantType(String assistantType) {
		this.assistantType = assistantType;
	}
	
	public int getScholarshipRate() {
		return scholarshipRate;
	}

	public void setScholarshipRate(int scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}
	
	public Graduate(String name, String course, int grade, int credit, String assistantType, int scholarshipRate) {
		super.name = name;
		super.course = course;
		super.grade = grade;
		super.credit = credit;
		this.assistantType = assistantType;
		this.scholarshipRate = scholarshipRate;
	}
	
	@Override
	public String toString() {
		String str = "";
		System.out.println("�̸� : "+name);
		System.out.println("�Ҽ��а� : "+course);
		System.out.println("�г� : "+grade);
		System.out.println("�̼������� : "+credit);
		
		if(!(assistantType.equals("���� ����") || assistantType.equals("���� ����"))) {
			assistantType = null;
			System.out.println("�������� : "+assistantType);
		}
		else System.out.println("�������� : "+assistantType);
		
		if(scholarshipRate<0 || scholarshipRate>100) System.out.println("���бݺ��� : ERROR");
		else System.out.println("���бݺ��� : "+(double)scholarshipRate/100);
		
		System.out.println("-----------------------");
		return str;
	}
}
