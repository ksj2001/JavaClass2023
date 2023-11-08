package chapter_05;

public class Prob07 {

	public static void main(String[] args) {
		int[] a = {3,2,4,1,5};
		int[] b = {3,2,4,1};
		int[] c = {3,2,4,1,5};
		int[] d = {2,7,1,8,2};
		
		System.out.println(compare(a,b));
		System.out.println(compare(a,c));
		System.out.println(compare(a,d));
	}
	
	public static boolean compare(int[] org1, int[] org2) {
		int index = 0;
		
		if(org1.length == org2.length) {
			for(int i=0; i<org1.length; i++) {
				if(org1[i] != org2[i]) // 배열 내용이 다른 경우
					index = -1;
			}
		}
		else { // 배열 길이가 다른 경우
			index = -1;
		}
		
		if(index == -1)
			return false;
		else
			return true;
	}
}
