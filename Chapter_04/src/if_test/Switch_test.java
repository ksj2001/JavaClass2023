package if_test;
import java.util.*; //Scanner Ŭ����, Random Ŭ���� import�ؿ���
public class Switch_test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String grade;
		System.out.println("���� �Է�: ");
		
		int score = scan.nextInt();
		
		switch(score) {
			case 90 :
				grade = "��";
				break;
			case 80 :
				grade = "��";
				break;
			case 70 :
				grade = "��";
				break;
			case 60 :
				grade = "��";
				break;
			default:
				grade = "��";
				break;
						}
		System.out.println(score+"���� "+grade+"�Դϴ�");
		scan.close();
	}
	
}