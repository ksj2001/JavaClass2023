package chapter_03;

public class Prob09 {

	public static void main(String[] args) {
		foo("�ȳ�", 1);
		foo("�ȳ��ϼ���", 1, 2);
		foo("�� �־�");
	}
	
	public static void foo(String s, int n) {
		System.out.println(s+" "+n);
	}
	
	public static void foo(String s, int n1, int n2) {
		System.out.println(s+" "+n1+" "+n2);
	}
	
	public static void foo(String s) {
		System.out.println(s);
	}
}
