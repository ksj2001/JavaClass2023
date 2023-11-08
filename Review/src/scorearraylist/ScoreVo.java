package scorearraylist;

public class ScoreVo {
	public static int cnt;
	private int num;
	private String name;
	private int java;
	private int jsp;
	private int spring;
	private int total;
	private double avg;
	private int rank = 1;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	
	public ScoreVo() {}
	public ScoreVo(String name, int java, int jsp, int spring) {
		//******************************
		//num++;
		num = ++cnt;
		//******************************
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		
		total += java+jsp+spring;
		avg = (double)total/3;
	}
	
	@Override
	public String toString() {
		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d", num,name,java,jsp,spring,total,avg,rank);
	}
}
