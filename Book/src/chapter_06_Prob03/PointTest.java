package chapter_06_Prob03;

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point(24,62);
		MovablePoint mp = new MovablePoint(30,16,2,4);
		
		System.out.println(p.toString());
		System.out.println(mp.toString());
	}

}
