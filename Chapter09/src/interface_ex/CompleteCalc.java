package interface_ex;

public class CompleteCalc extends Calculator{

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

	public void showInfo() {
		System.out.println("Calc 계산기입니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기입니다.");
	}
	
	
}
