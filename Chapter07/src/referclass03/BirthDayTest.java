package referclass03;
class BirthDay{
	// 접근 제어자 private은 자기 클래스에만 사용할 수 있다.
	// id, 패스워드의 경우 접근 제어자로 private을 사용한다.
	// public 접근 제어자는 어디서나 사용 가능
	// 기본 자료형은 같은 패키지에서만 사용 가능
	private int month;
	private int day;
	private int year;
	
	
	// private 접근 제어자로 자료형을 지정할 경우
		// getter setter 작업이 필요함
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
					System.out.println("날짜 오류");
				}
				else {
						this.day = day;
				}
			}
			else {
				if(day>29) {
					System.out.println("날짜 오류");
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
		
		
		System.out.println(bd.getYear()+"년 "+bd.getMonth()+"월 "+bd.getDay()+"일");
	}

}
