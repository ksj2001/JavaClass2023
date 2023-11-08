package megabox_Movie_Renew;

import java.util.Date;

public class PointDTO {
	private String id; // ���̵�
	private Date date; // ����Ʈ ����/�������
	private String detail; // ����
	private int point; // ����/���� ����Ʈ
	private int log; // ����Ʈ ����/��� ȸ���� �ε���
	
	public PointDTO() {}
	public PointDTO(String id, Date date, String detail, int point, int log) {
		this.id = id;
		this.date = date;
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
