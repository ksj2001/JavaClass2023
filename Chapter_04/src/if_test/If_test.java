package if_test;

public class If_test {

	public static void main(String[] args) {
		int score = 75;
		String grade;
		//90�� �̻��� ��
		//80�� �̻��� ��
		//70�� �̻��� ��
		//60�� �̻��� ��
		//�� �̿ܿ��� ��
		if (score>=90) {
			grade = "��";
		}
		else if (score>=80) {
			grade = "��";
		}
		else if (score>=70) {
			grade = "��";
		}
		else if (score>=60) {
			grade = "��";
		}
		else {
			grade = "��";
		}
		System.out.println(score+"���� "+grade+"�Դϴ�");
	}
}
