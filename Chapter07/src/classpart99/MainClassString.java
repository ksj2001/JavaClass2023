package classpart99;
import java.util.*;
public class MainClassString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Program pg = new Program();
		
		pg.ids = new String[]{"qwer", "javaking", "abcd"};
		pg.pws = new String[]{"1111", "2222", "3333"};
		pg.items = new String[]{"사과", "바나나", "딸기"};
		pg.MAX_SIZE = 100;
		pg.jang = new int [pg.MAX_SIZE][2];
		pg.menu = -1;
		pg.inputId = null;
		pg.inputPw = null;
		pg.currentStatus = new String("로그아웃");
		pg.run = true;
		pg.log = -1;
		pg.productNum = 0;
		pg.run_product = true;
		pg.cnt = 0;
		pg.bag1 = new int[3];
		pg.bag2 = new int[3];
		pg.bag3 = new int[3];
		
		pg.selectMenu();
		scan.close();
	}
}
