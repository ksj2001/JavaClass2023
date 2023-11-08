package interfaceEx01;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("#,###");
		Buyable tel = new Television("MV-2020","TV-samsung",509000);
		Buyable ref = new Refrigerator("MV-2020","1���",2000000);
		
		System.out.println("----"+tel.getName()+"���� -----");
		System.out.println("����Ŀ : "+tel.getMaker());
		System.out.println("�𵨸� : "+tel.getModel());
		System.out.println("�ݾ� : "+d.format(tel.getPrice()));
		System.out.println("------------------");
		System.out.println("----"+ref.getName()+"���� -----");
		System.out.println("ȿ���� ��� : "+ref.getMaker());
		System.out.println("�𵨸� : "+ref.getModel());
		System.out.println("�ݾ� : "+d.format(ref.getPrice()));
		System.out.println("------------------");
	}

}
