package datetest;
import java.util.Date; // 시스템의 날짜를 연, 월, 일, 요일, 시간을 불러오는 클래스
import java.text.SimpleDateFormat;
// 날짜를 원하는 형식으로 파싱(형태를 변환)하는 클래스
// E=>요일, a=>한글로 오전/오후 
public class DateClass {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// Fri Jan 07 13:55:03 KST 2022
		// KST (Korea Standard Time) 편집
		// KST는 우리나라 시간대를 의미하는 표기로 KST 는 UTC +9 에 해당한다. 세계시간에 9시간 빠른 시간
		//협정 세계시를 영어로 하면 Universal Time Coordinated 이를 UTC 라 한다
		// 1972년 1 월 1 일 세계 표준시로 규정되었다
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf1.format(date));
		
		/*
		 * System.currentTimeMillis
		 *
		 * . 1970 년 1 월 1 일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초 (1/1000 초 ) 단위로 얻어온다
		 *
		 * . 13 자리의 숫자를 얻어오기 때문에 int 로 처리하면 에러가 발생되므로 long 로 처리해야 한다
		 */
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat sdf2 = new SimpleDateFormat("y-MM-DD h:m:s");
		System.out.println(sdf2.format(time));
		
		//----------------------------------------------------
		// date 클래스에서 연, 월, 일, 시, 분, 초를 추출하고자 할 때는 get 메서드 이용
		// 추출한 연도에 1900을 더한다
		// 추출한 월에 1을 더한다
		// 1900년 1월 1일부터의 날짜가 추출된다.
		System.out.println(date.getYear());
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		System.out.println(date.getDay()); // 요일을 숫자로 출력, 0(일요일), 1(월요일).....6(토요일)
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
	}

}
