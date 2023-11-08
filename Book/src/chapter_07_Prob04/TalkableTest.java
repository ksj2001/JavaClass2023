package chapter_07_Prob04;

public class TalkableTest {
	static void speak(Talkable t) {
		/*
		if(obj instanceof Korean) {
			Talkable t = new Korean();
			t.talk();
		}
		else if(obj instanceof American) {
			Talkable t = new American();
			t.talk();
		}
		else {
			System.out.println("ERROR");
		}
		*/
		t.talk();		
	}
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}

}
