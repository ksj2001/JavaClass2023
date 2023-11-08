package abstracttest03;
import java.util.*;
public abstract class Converter {
	protected double ratio;
	
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
	public abstract double convert(double src);
	public abstract String getSrcString(); // ��,km
	public abstract String getDestString(); // �޷�,mile
	
	final public void run() { // �������
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"���� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double num = scan.nextDouble();
		System.out.println("��ȯ ��� : "+convert(num)+getDestString()+"�Դϴ�");
		//scan.close(); // NoSuchElementException �߻�
	}
}
