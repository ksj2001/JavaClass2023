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
		System.out.println("이름 : "+name);
		System.out.println("소속학과 : "+course);
		System.out.println("학년 : "+grade);
		System.out.println("이수학점수 : "+credit);
		
		if(!(assistantType.equals("교육 조교") || assistantType.equals("연구 조교"))) {
			assistantType = null;
			System.out.println("조교유형 : "+assistantType);
		}
		else System.out.println("조교유형 : "+assistantType);
		
		if(scholarshipRate<0 || scholarshipRate>100) System.out.println("장학금비율 : ERROR");
		else System.out.println("장학금비율 : "+(double)scholarshipRate/100);
		
		System.out.println("-----------------------");
		return str;
	}
}
