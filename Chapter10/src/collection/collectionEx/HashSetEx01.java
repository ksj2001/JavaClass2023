package collection.collectionEx;
import java.util.HashSet;
import java.util.Random;
public class HashSetEx01 {

	public static void main(String[] args) {
		Random ran = new Random();
		HashSet<Integer> lottoSet = new HashSet<>();
		/*
		 * �ζǹ�ȣ 1~45 ���� ���� �� ���� �ϰ� 6���� �ߺ� ���� ����
		 * �ܼ� â�� ��� �ϴ� ���α׷����� �ۼ��Ͻÿ�.
		 * <��� �����>
		 * >> �ζǹ�ȣ 2,19,6,40,25,43,
		 */
		while(true) {
			int ranNum = ran.nextInt(45)+1;
			lottoSet.add(ranNum);
			
			if(lottoSet.size()==6) {
				break;
			}
		}
		
		for(Integer num : lottoSet) {
			System.out.print(num+",");
		}
	}

}
