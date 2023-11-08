package megabox_Movie_Renew;

import java.util.Date;

// 예매목록 요소들
public class TicketingDTO {
	private String id; // 예매한 회원
	private String name; // 영화이름
	private Date rezTime; // 예매한 시간
	private String local; // 지역
	private String theater; // 영화관
	private Date day; // 영화가 상영하는 날짜
	private Date time; // 영화가 시작하는(상영하는) 시간
	private Date endTime; // (예매한) 영화가 끝나는 시간
	private int cnt; // 예매 매수
	private int cost; // 가격
	private int point; // 사용한 포인트
	
	public TicketingDTO() {}
	public TicketingDTO(String id, String name, Date rezTime, String local, String theater, Date time, Date endTime, int cnt, int cost, int point) {
		this.id = id;
		this.name = name;
		this.rezTime = rezTime;
		this.local = local;
		this.theater = theater;
		this.time = time;
		this.endTime = endTime;
		this.cnt = cnt;
		this.cost = cost;
		this.point = point;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRezTime() {
		return rezTime;
	}
	public void setRezTime(Date rezTime) {
		this.rezTime = rezTime;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
