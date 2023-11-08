package screenarraylist;
import java.util.*;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
public class ScoreArrayList {
	//ArrayList �ν��Ͻ�ȭ �ϱ�
	ArrayList<ScoreVo> scoreList = new ArrayList<>();
	Date date = new Date(); // Date Ŭ���� �ν��Ͻ�
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����"); // SimpleDateFormat(Date �Ľ�) Ŭ���� �ν��Ͻ�
	
	@Override
	public String toString() {
		String str = "";
		System.out.println(sdf.format(date));
		System.out.println("==================================================");
		System.out.println("��ȣ\t�̸�\tjava\tjsp\tspring\t����\t���\t����");
		System.out.println("==================================================");
		
		// �������ϱ�
		for(int i=0;i<scoreList.size()-1;i++) {
			System.out.print(i+" ");
			for(int j=i+1;i<scoreList.size();j++) {
				
				//if(scoreList.get(i).getAvg()>scoreList.get(j).getAvg()) {
				//	scoreList.get(i).setRank(scoreList.get(i).getRank()+1);	
				//}
			}
			System.out.println();
		}
		
		// ����ϱ�
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
	
	// ArrayList�� ���� �߰��ϴ� addScore �޼��� �ۼ�
	public void addScore(ScoreVo vo) {
		scoreList.add(vo);
	}
	
}
