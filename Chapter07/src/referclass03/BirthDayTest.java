package referclass03;
class BirthDay{
	// ���� ������ private�� �ڱ� Ŭ�������� ����� �� �ִ�.
	// id, �н������� ��� ���� �����ڷ� private�� ����Ѵ�.
	// public ���� �����ڴ� ��𼭳� ��� ����
	// �⺻ �ڷ����� ���� ��Ű�������� ��� ����
	private int month;
	private int day;
	private int year;
	
	
	// private ���� �����ڷ� �ڷ����� ������ ���
		// getter setter �۾��� �ʿ���
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(month==2) {
			if((year % 4) != 0) {
				if(day>28) {
					System.out.println("��¥ ����");
				}
				else {
						this.day = day;
				}
			}
			else {
				if(day>29) {
					System.out.println("��¥ ����");
				}
				else {
					this.day = day;
				}
			}
		}
		else {
			this.day = day;
		}
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
}
public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay bd = new BirthDay();
		bd.setMonth(2);
		bd.setYear(2020);
		bd.setDay(30);
		
		
		System.out.println(bd.getYear()+"�� "+bd.getMonth()+"�� "+bd.getDay()+"��");
	}

}
