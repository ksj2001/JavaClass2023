package multi_array;
public class Multi_ArrayExample09 {
	public static void main(String[] args) {
		int[][] apt ={
		{101, 102, 103},
		{201, 202, 203},
		{301, 302, 303}
		};
		int[][] pay ={
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
				};
		int[] sum = new int[3];
		for(int i=0;i<pay.length;i++) {
			for(int j=0;j<pay[0].length;j++) {				
				sum[i] += pay[i][j];
			}
		}
		for(int i=0;i<sum.length;i++) {
			System.out.print(sum[i]+" ");
		}
	}
}
