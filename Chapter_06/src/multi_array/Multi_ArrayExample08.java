package multi_array;
public class Multi_ArrayExample08 {
	public static void main(String[] args) {
		int[][] arr ={
		{101, 102, 103, 104},
		{201, 202, 203, 204},
		{301, 302, 303, 304}
		};
		int[] garo = new int[3];
		int[] sero = new int[4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				//garo[i] = arr[i][0]+arr[i][1]+arr[i][2]+arr[i][3];
				//sero[j] = arr[0][j]+arr[1][j]+arr[2][j];
				
				garo[i] += arr[i][j];
				sero[j] += arr[i][j];
			}
		}
		for(int i=0;i<garo.length;i++) {
			System.out.print(garo[i]+" ");
		}
		System.out.println();
		for(int i=0;i<sero.length;i++) {
			System.out.print(sero[i]+" ");
		}
	}
}
