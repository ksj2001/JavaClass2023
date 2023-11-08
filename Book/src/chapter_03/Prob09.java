package chapter_03;

public class Prob09 {

	public static void main(String[] args) {
		foo("æ»≥Á", 1);
		foo("æ»≥Á«œººø‰", 1, 2);
		foo("¿ﬂ ¿÷æÓ");
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
