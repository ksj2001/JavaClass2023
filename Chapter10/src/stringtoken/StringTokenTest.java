package stringtoken;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str1 = "java android";
           String str2 = "java!android";
           String str3 = "java-android!fun";
           
           // ù ��° ��� : ���ڿ��� �������� �������� ���� ���� ��� ����
           StringTokenizer st = new StringTokenizer(str1);
           // nextToken �޼��� : ���� ���ڸ� ��ūȭ
           // trim �޼��� : ������ �����ϰ� ���
           System.out.println(st.nextToken().trim());
           System.out.println(st.nextToken().trim());
           System.out.println();
           // �� ��° ��� : Ư�����ڷ� �ۼ��� ���ڸ� �и��� �� ���
           StringTokenizer st2 = new StringTokenizer(str3,"-!");
           for(int i=0;i<3;i++) {
        	   System.out.println(st2.nextToken().trim());
           }
           System.out.println();
           // �� ��° ��� : Ư�����ڵ� ��ū���� ���
           StringTokenizer st3 = new StringTokenizer(str3,"-!",true);
           for(int i=0;i<5;i++) {
        	   System.out.println(st3.nextToken().trim());
           }
	}

}
