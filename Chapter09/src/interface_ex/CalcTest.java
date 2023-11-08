package interface_ex;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		/*
		 * CompleteCalc completecalc = new CompleteCalc(); int a = 10; int b = 5;
		 * System.out.println(calc.add(a, b)); System.out.println(calc.subtract(a, b));
		 * System.out.println(calc.multiply(a, b)); System.out.println(calc.divide(a,
		 * b)); completecalc.showInfo();
		 */
		int[] arr = {1,2,3,4,5};
		calc.description();
		//calc.total(arr);
	}

}
