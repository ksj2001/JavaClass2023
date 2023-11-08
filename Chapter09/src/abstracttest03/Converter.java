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
	public abstract String getSrcString(); // 원,km
	public abstract String getDestString(); // 달러,mile
	
	final public void run() { // 정보출력
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"으로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double num = scan.nextDouble();
		System.out.println("변환 결과 : "+convert(num)+getDestString()+"입니다");
		//scan.close(); // NoSuchElementException 발생
	}
}
