package lambdaEx;

@FunctionalInterface
interface Interface1 {
	int printMax(int a, int b);
} 

@FunctionalInterface
interface Interface2 {
	void printName(String name, int i);
}

@FunctionalInterface
interface Interface3 {
	int printSquare(int x);
}

@FunctionalInterface
interface Interface4 {
	int rollDice();
}

public class LambdaEx02 {

	public static void main(String[] args) {
		Interface1 lam1 = (a,b) -> {return a>b?a:b;};
		System.out.println(lam1.printMax(5, 10));
		
		Interface2 lam2 = (name,i) -> System.out.println(name+" "+i);
		lam2.printName("ȫ�浿", 21);
		
		Interface3 lam3 = x -> {return x*x;};
		System.out.println(lam3.printSquare(5));
		
		Interface4 lam4 = () -> {return (int)(Math.random()*6);};
		System.out.println(lam4.rollDice());
	}

}
