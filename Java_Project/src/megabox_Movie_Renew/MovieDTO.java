package megabox_Movie_Renew;

import java.util.Calendar;
import java.util.Date;

public class MovieDTO extends MovieSeatElements{
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR)-1900;
	int month = cal.get(Calendar.MONTH)+1;
	int date = cal.get(Calendar.DATE);
	
	// 날짜
	int day1 = cal.get(Calendar.DATE);
	int day2 = cal.get(Calendar.DATE)+1;
	int day3 = cal.get(Calendar.DATE)+2;
	
	protected String[] movieName = {"패왕별희","리바운드","에어    "}; // 영화 이름
	protected Date[] releaseDate = {new Date(2023-1900,4-1,1),new Date(2023-1900,4-1,5),new Date(2023-1900,4-1,5)}; // 상영일
	protected String[] local = {"서울","경기도","인천"}; // 지역
	protected String[] theater = {"강남","목동","성수", // 극장(서울)
								  "동탄","분당","일산", // 극장(경기도)
								  "검단","송도","영종"}; // 극장(인천)
	
	//시간
	protected Date[] time = {new Date(year,month-1,day1,10,00),new Date(year,month-1,day1,13,30),new Date(year,month-1,day1,17,00), // day1
							 new Date(year,month-1,day2,12,00),new Date(year,month-1,day2,16,00),new Date(year,month-1,day2,20,00), // day2
	                         new Date(year,month-1,day3,9,00),new Date(year,month-1,day3,12,00),new Date(year,month-1,day3,15,00)}; // day3
	
	protected Date[] endTime = {new Date(year,month-1,day1,12,51),new Date(year,month-1,day1,16,21),new Date(year,month-1,day1,19,51), // 패왕별희,day1
								new Date(year,month-1,day1,12,02),new Date(year,month-1,day1,15,32),new Date(year,month-1,day1,19,02), // 리바운드,day1
								new Date(year,month-1,day1,11,52),new Date(year,month-1,day1,15,22),new Date(year,month-1,day1,18,52), // 에어,day1
			 				    new Date(year,month-1,day2,14,51),new Date(year,month-1,day2,18,51),new Date(year,month-1,day2,22,51), // 패왕별희,day2
			 				    new Date(year,month-1,day2,14,02),new Date(year,month-1,day2,18,02),new Date(year,month-1,day2,22,02), // 리바운드,day2
			 				    new Date(year,month-1,day2,13,52),new Date(year,month-1,day2,17,52),new Date(year,month-1,day2,21,52), // 에어,day2
			 				    new Date(year,month-1,day3,11,51),new Date(year,month-1,day3,14,51),new Date(year,month-1,day3,17,51), // 패왕별희,day3
			 				    new Date(year,month-1,day3,11,02),new Date(year,month-1,day3,14,02),new Date(year,month-1,day3,17,02), // 리바운드,day3
			 				    new Date(year,month-1,day3,10,52),new Date(year,month-1,day3,13,52),new Date(year,month-1,day3,16,52)}; // 에어,day3
	protected int reserveNum;
	protected int cost;
	
	public String[] getLocal() {
		return local;
	}
	public void setLocal(String[] local) {
		this.local = local;
	}
	public String[] getTheater() {
		return theater;
	}
	public void setTheater(String[] theater) {
		this.theater = theater;
	}
	public String[] getMovieName() {
		return movieName;
	}
	public void setMovieName(String[] movieName) {
		this.movieName = movieName;
	}
	public Date[] getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date[] releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date[] getTime() {
		return time;
	}
	public void setTime(Date[] time) {
		this.time = time;
	}
	public Date[] getEndTime() {
		return endTime;
	}
	public void setEndTime(Date[] endTime) {
		this.endTime = endTime;
	}
}
