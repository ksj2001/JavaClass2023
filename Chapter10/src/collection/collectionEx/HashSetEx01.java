package collection.collectionEx;
import java.util.HashSet;
import java.util.Random;
public class HashSetEx01 {

	public static void main(String[] args) {
		Random ran = new Random();
		HashSet<Integer> lottoSet = new HashSet<>();
		/*
		 * 로또번호 1~45 중의 숫자 중 랜덤 하게 6개를 중복 없이 얻어내서
		 * 콘솔 창에 출력 하는 프로그래밍을 작성하시오.
		 * <출력 결과물>
		 * >> 로또번호 2,19,6,40,25,43,
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
