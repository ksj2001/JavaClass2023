package multi_array;
public class Multi_ArrayExample11 {
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
		int max_pay = 0; // 관리비 최댓값
		int min_pay = 5000; // 관리비 최솟값
		
		int max_pay_index_i = 0; // 관리비가 가장 많이 나온 집의 호수 위치(i)
		int max_pay_index_j = 0; // 관리비가 가장 많이 나온 집의 호수 위치(j)
		int min_pay_index_i = 0; // 관리비가 가장 적게 나온 집의 호수 위치(i)
		int min_pay_index_j = 0; // 관리비가 가장 적게 나온 집의 호수 위치(j)
		for(int i=0;i<pay.length;i++) {
			for(int j=0;j<pay[0].length;j++) {				
				if(max_pay<pay[i][j]) {
					max_pay = pay[i][j];
					max_pay_index_i = i;
					max_pay_index_j = j;
				}
			}
		}
		for(int i=0;i<pay.length;i++) {
			for(int j=0;j<pay[0].length;j++) {				
				if(min_pay>pay[i][j]) {
					min_pay = pay[i][j];
					min_pay_index_i = i;
					min_pay_index_j = j;
				}
			}
		}
		System.out.print("가장 많이 나온 집("+apt[max_pay_index_i][max_pay_index_j]+
				"), 가장 적게 나온 집("+apt[min_pay_index_i][min_pay_index_j]+")");
	}
}
