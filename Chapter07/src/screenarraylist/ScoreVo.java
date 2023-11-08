package screenarraylist;

public class ScoreVo {
	public static int cnt; // �ڵ����� 1�� ������Ű�� ����
	private int no; // ��ȣ
	private String name; // �̸�
	private int java;
	private int jsp;
	private int spring;
	private int total; // �հ�
	private double avg; // ���
	private int rank = 1; // ����(�ʱⰪ=1)
	
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
	
	//������
	public ScoreVo() {}
	public ScoreVo(String name, int java, int jsp, int spring) {
		no = ++cnt; // ��ȣ�� �ڵ����� 1�� ������Ű�� �ڵ�
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		total = java+jsp+spring;
		avg = (double)total/3;
	}
	
	 @Override // ������
	 //toString�� �ڹ��� �ֻ��� Ŭ������ Object�� �޼����̴�.
	 //toString �޼���� �������� ������ ���ڿ��� return�ϴ� �޼����̴�.
	 //String.format���� %d(����),%s(���ڿ�),%f(�Ǽ�)�� ǥ���Ͽ� ����Ѵ�.
	 public String toString() {
		 return String.format("%d %s %3d %3d %3d %3d %.2f %d", no,name,java,jsp,spring,total,avg,rank);
	 }
}
