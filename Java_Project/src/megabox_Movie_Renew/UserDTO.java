package megabox_Movie_Renew;

public class UserDTO {
	private String id; // 아이디
	private String pw; // 비밀번호
	private String birthDate; // 생년월일
	private String phoneNumber; // 전화번호
	private String email; // 이메일
	private int point; // 포인트
	
	public UserDTO() {}
	public UserDTO(String id, String pw, String birthDate, String phoneNumber, String email) {
		this.id = id;
		this.pw = pw;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.email = email;
		point += 1000;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
