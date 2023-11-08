package screenarraylist;

public class ScoreVo {
	public static int cnt; // 자동으로 1씩 증가시키는 변수
	private int no; // 번호
	private String name; // 이름
	private int java;
	private int jsp;
	private int spring;
	private int total; // 합계
	private double avg; // 평균
	private int rank = 1; // 석차(초기값=1)
	
	// Getter, Setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	//생성자
	public ScoreVo() {}
	public ScoreVo(String name, int java, int jsp, int spring) {
		no = ++cnt; // 번호를 자동으로 1씩 증가시키는 코딩
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		total = java+jsp+spring;
		avg = (double)total/3;
	}
	
	 @Override // 재정의
	 //toString은 자바의 최상위 클래스인 Object의 메서드이다.
	 //toString 메서드는 정보들의 값들을 문자열로 return하는 메서드이다.
	 //String.format에서 %d(정수),%s(문자열),%f(실수)로 표현하여 출력한다.
	 public String toString() {
		 return String.format("%d %s %3d %3d %3d %3d %.2f %d", no,name,java,jsp,spring,total,avg,rank);
	 }
}
