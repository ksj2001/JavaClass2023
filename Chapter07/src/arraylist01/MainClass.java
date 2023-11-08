package arraylist01;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		ArrayList<TV> tvlist = new ArrayList<>();
		tvlist.add(new TV("TV","삼성",1000));
		tvlist.add(new TV("시그니처TV","엘지",2000));
		tvlist.add(new TV("스마트TV","애플",3000));
		tvlist.remove(1);
		
		for(int i=0;i<tvlist.size();i++) {
			TV tv = tvlist.get(i);
			tv.showInfo();
		}
	}

}
