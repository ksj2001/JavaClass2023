package megabox_Movie;

import java.util.Date;

public class PointUseDTO {
	private String id; // 아이디
	private Date date; // 포인트 적립/사용일자
	private String detail; // 내용
	private int point; // 적립/사용된 포인트
	private int log; // 포인트 적립/사용 회원의 인덱스
	
	public PointUseDTO() {}
	public PointUseDTO(String id, Date date, String detail, int point, int log) {
		this.id = id;
		this.date = date;
		date.setYear(date.getYear()-1900);
		date.setMonth(date.getMonth()-1);
		date.setDate(date.getDate());
		date.setHours(date.getHours());
		date.setMinutes(date.getMinutes());
		date.setSeconds(date.getSeconds());
		this.detail = detail;
		this.point = point;
		this.log = log;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getLog() {
		return log;
	}
	public void setLog(int log) {
		this.log = log;
	}
}
