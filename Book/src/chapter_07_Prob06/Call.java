package chapter_07_Prob06;

public class Call {
	public void invoke(Printable p) {
		if(p instanceof A4)
			((A4) p).a(); // ************
		else if(p instanceof B4)
			((B4) p).b(); // ************
		else System.out.println("ERROR");
	}
}
