package myCalendar;

import java.util.Calendar;

public class CalendarTest {
	private int year;
	private int month;
	int[][] calendarForm = new int[6][7];
	
	public CalendarTest() {}
	public CalendarTest(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setCalendarForm() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, 1);
		int row = 0;
		int column = calendar.get(Calendar.DAY_OF_WEEK)-1;
		int lastDay = calendar.getActualMaximum(Calendar.DATE);
		System.out.println(column);
		for(int i=1;i<=lastDay;i++) {
			calendarForm[row][column] = i;
			if(column==6) {
				row++;
				column = 0;
			}
			else {
				column++;
			}
		}
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<calendarForm.length;i++) {
			for(int j=0;j<calendarForm[0].length;j++) {
				if(calendarForm[i][j]==0) {
					System.out.print("\t");
				}
				else {
					System.out.print(calendarForm[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
	
}
