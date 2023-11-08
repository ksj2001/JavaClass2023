package array;
public class ArrayExample09 {

	public static void main(String[] args) {
		int[] hakbuns = {1001,1002,1003,1004,1005};
		int[] scores = {87,11,45,98,23};
		int max_hakbuns = 0;
		int max_scores = 0;
		for(int i=0;i<5;i++) {
			if (max_scores<scores[i]) {
				max_scores = scores[i];
				max_hakbuns = hakbuns[i];
			}
		}
		System.out.println(max_hakbuns+"¹ø("+max_scores+"Á¡)");
	}
}
