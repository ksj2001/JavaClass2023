package format;

import java.text.*;
import java.util.*;

public class NumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat num1 = NumberFormat.getNumberInstance();
		NumberFormat num2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		NumberFormat num3 = NumberFormat.getPercentInstance();
		NumberFormat num4 = NumberFormat.getIntegerInstance();
		
		
		System.out.print("자료를 입력하세요 : ");
		double number = scan.nextDouble();
		System.out.println(num1.format(number));
		System.out.println(num2.format(number));
		System.out.println(num3.format(number));
		System.out.println(num4.format(number));
		
		// ----------------------------------------------------------------
		
		DecimalFormat d1 = new DecimalFormat("0,000");
		DecimalFormat d2 = new DecimalFormat("#,###");
		DecimalFormat d3 = new DecimalFormat("#,##0");
		DecimalFormat d4 = new DecimalFormat("#,##0%");
		DecimalFormat d5 = new DecimalFormat("#.0");
		DecimalFormat d6 = new DecimalFormat("\u00A4#");
		DecimalFormat d7 = new DecimalFormat("￦#,###.0");
		
		System.out.println(d1.format(number));
		System.out.println(d2.format(number));
		System.out.println(d3.format(number));
		System.out.println(d4.format(number));
		System.out.println(d5.format(number));
		System.out.println(d6.format(number));
		System.out.println(d7.format(number));
		
	}

}
