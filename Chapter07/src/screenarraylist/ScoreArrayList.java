package screenarraylist;
import java.util.*;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
public class ScoreArrayList {
	//ArrayList 인스턴스화 하기
	ArrayList<ScoreVo> scoreList = new ArrayList<>();
	Date date = new Date(); // Date 클래스 인스턴스
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); // SimpleDateFormat(Date 파싱) 클래스 인스턴스
	
	@Override
	public String toString() {
		String str = "";
		System.out.println(sdf.format(date));
		System.out.println("==================================================");
		System.out.println("번호\t이름\tjava\tjsp\tspring\t총점\t평균\t석차");
		System.out.println("==================================================");
		
		// 석차구하기
		for(int i=0;i<scoreList.size()-1;i++) {
			System.out.print(i+" ");
			for(int j=i+1;i<scoreList.size();j++) {
				
				//if(scoreList.get(i).getAvg()>scoreList.get(j).getAvg()) {
				//	scoreList.get(i).setRank(scoreList.get(i).getRank()+1);	
				//}
			}
			System.out.println();
		}
		
		// 출력하기
		for(int i=0;i<scoreList.size();i++) {
			System.out.print(scoreList.get(i).getNo()+"\t");
			System.out.print(scoreList.get(i).getName()+"\t");
			System.out.print(scoreList.get(i).getJava()+"\t");
			System.out.print(scoreList.get(i).getJsp()+"\t");
			System.out.print(scoreList.get(i).getSpring()+"\t");
			System.out.print(scoreList.get(i).getTotal()+"\t");
			System.out.print(String.format("%.2f", scoreList.get(i).getAvg())+"\t");
			System.out.print(scoreList.get(i).getRank()+"\t");
			System.out.println();
		}
		return str;
	}
	
	// ArrayList의 값을 추가하는 addScore 메서드 작성
	public void addScore(ScoreVo vo) {
		scoreList.add(vo);
	}
	
}
