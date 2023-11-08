package returnPackage;
import java.util.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // System.in : 콘솔에 출력하세요.
		//Test2 t2 = new Test2();
		//int arr[] = {10,20,30,40,50};
		//System.out.println(t2.multiple(arr));
		/*Test3 t3 = new Test3();
		while(true) {
			System.out.print("메뉴 입력 : ");
			int sel = scan.nextInt();
			if(sel==1) {
				t3.test5();
			}
			else {
				System.out.println("종료");
				return;
			}
		}*/
		This t = new This("홍길동","중동",30,100);
		System.out.println(t.name);
		System.out.println(t.address);
		System.out.println(t.age);
		System.out.println(t.total);
	}
}
