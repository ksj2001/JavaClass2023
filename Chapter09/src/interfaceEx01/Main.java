package interfaceEx01;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("#,###");
		Buyable tel = new Television("MV-2020","TV-samsung",509000);
		Buyable ref = new Refrigerator("MV-2020","1등급",2000000);
		
		System.out.println("----"+tel.getName()+"정보 -----");
		System.out.println("메이커 : "+tel.getMaker());
		System.out.println("모델명 : "+tel.getModel());
		System.out.println("금액 : "+d.format(tel.getPrice()));
		System.out.println("------------------");
		System.out.println("----"+ref.getName()+"정보 -----");
		System.out.println("효율성 등급 : "+ref.getMaker());
		System.out.println("모델명 : "+ref.getModel());
		System.out.println("금액 : "+d.format(ref.getPrice()));
		System.out.println("------------------");
	}

}
