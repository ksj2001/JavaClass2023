package screenarraylist;

public class MainClass {

	public static void main(String[] args) {
		ScoreArrayList score = new ScoreArrayList();

		score.addScore(new ScoreVo("홍길동",90,90,85)); 
		score.addScore(new ScoreVo("개나리",100,60,85)); 
		score.addScore(new ScoreVo("진달래",70,100,75));
		score.addScore(new ScoreVo("김백합",90,60,85)); 
		score.addScore(new ScoreVo("최철수",99,87,85));
		System.out.println(score.toString());
	}

}
