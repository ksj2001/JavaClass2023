package megabox_Movie_Renew;

import java.util.Date;

// ���Ÿ�� ��ҵ�
public class TicketingDTO {
	private String id; // ������ ȸ��
	private String name; // ��ȭ�̸�
	private Date rezTime; // ������ �ð�
	private String local; // ����
	private String theater; // ��ȭ��
	private Date day; // ��ȭ�� ���ϴ� ��¥
	private Date time; // ��ȭ�� �����ϴ�(���ϴ�) �ð�
	private Date endTime; // (������) ��ȭ�� ������ �ð�
	private int cnt; // ���� �ż�
	private int cost; // ����
	private int point; // ����� ����Ʈ
	
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
