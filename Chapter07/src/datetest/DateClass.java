package datetest;
import java.util.Date; // �ý����� ��¥�� ��, ��, ��, ����, �ð��� �ҷ����� Ŭ����
import java.text.SimpleDateFormat;
// ��¥�� ���ϴ� �������� �Ľ�(���¸� ��ȯ)�ϴ� Ŭ����
// E=>����, a=>�ѱ۷� ����/���� 
public class DateClass {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// Fri Jan 07 13:55:03 KST 2022
		// KST (Korea Standard Time) ����
		// KST�� �츮���� �ð��븦 �ǹ��ϴ� ǥ��� KST �� UTC +9 �� �ش��Ѵ�. ����ð��� 9�ð� ���� �ð�
		//���� ����ø� ����� �ϸ� Universal Time Coordinated �̸� UTC �� �Ѵ�
		// 1972�� 1 �� 1 �� ���� ǥ�ؽ÷� �����Ǿ���
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH:mm:ss");
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf1.format(date));
		
		/*
		 * System.currentTimeMillis
		 *
		 * . 1970 �� 1 �� 1 �� ���� ���� �� �޼ҵ尡 ����Ǵ� �������� ������ �ð��� �и��� (1/1000 �� ) ������ ���´�
		 *
		 * . 13 �ڸ��� ���ڸ� ������ ������ int �� ó���ϸ� ������ �߻��ǹǷ� long �� ó���ؾ� �Ѵ�
		 */
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		SimpleDateFormat sdf2 = new SimpleDateFormat("y-MM-DD h:m:s");
		System.out.println(sdf2.format(time));
		
		//----------------------------------------------------
		// date Ŭ�������� ��, ��, ��, ��, ��, �ʸ� �����ϰ��� �� ���� get �޼��� �̿�
		// ������ ������ 1900�� ���Ѵ�
		// ������ ���� 1�� ���Ѵ�
		// 1900�� 1�� 1�Ϻ����� ��¥�� ����ȴ�.
		System.out.println(date.getYear());
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		System.out.println(date.getDay()); // ������ ���ڷ� ���, 0(�Ͽ���), 1(������).....6(�����)
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
	}

}
