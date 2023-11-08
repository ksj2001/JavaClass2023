package scorearraylist;
import java.util.*;
import java.text.*;

public class ScoreArrayList {
	ArrayList<ScoreVo> scorelist = new ArrayList<>();
	Date date = new Date();
	SimpleDateFormat sd = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
	
	@Override
	public String toString() {
		String str = "";
		System.out.println("=============================================================");
		System.out.println("��ȣ\t�̸�\tjava\tjsp\tspring\t����\t���\t����");
		System.out.println("=============================================================");
		for(int i=0;i<scorelist.size();i++) {
			for(int j=0;j<scorelist.size();j++) {
				if(scorelist.get(i).getTotal()<scorelist.get(j).getTotal()) {
					scorelist.get(i).setRank(scorelist.get(i).getRank()+1);
				}
			}
		}
		for(int i=0;i<scorelist.size();i++) {
			System.out.println(scorelist.get(i).toString());
		}
		return str;
	}
	
	public void addScore(ScoreVo vo) {
		scorelist.add(vo);
	}
}
