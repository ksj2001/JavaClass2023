package lambdaEx;

import java.util.Arrays;

@FunctionalInterface
interface lambdaArr {
	public int sumArr(int[] arr);
}

public class LambdaEx04 {

	public static void main(String[] args) {
		int[] arr = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random()*5)+1;
//		}
		
		// 람다로 변환
		//Arrays.asList(arr,1,2,3,4);// arr={1,2,3,4};
		Arrays.setAll(arr, i -> (int)(Math.random()*5)+1);
        System.out.println(Arrays.toString(arr));
        
		lambdaArr la = a -> {int sum = 0;for(int i: a) sum +=i;return sum;}; 
		System.out.println(la.sumArr(arr));
	}

}
