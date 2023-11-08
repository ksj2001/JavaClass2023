package multi_array;
import java.util.*;
public class Multi_ArrayExample10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
		int ho = 0; // 입력하는 호수
		int ho_index_i = 0; // 호수의 위치(세로(ex.101,201,301), i)
		int ho_index_j = 0; // 호수의 위치(가로(ex.101,102,103), j)
		System.out.print("입력 : ");
		ho = scan.nextInt();
		for(int i=0;i<apt.length;i++) {
			for(int j=0;j<apt[0].length;j++) {				
				if(ho==apt[i][j]) {
					ho_index_i = i;
					ho_index_j = j;
				}
			}
		}
		System.out.print("관리비 출력 : "+pay[ho_index_i][ho_index_j]);
		scan.close();
	}
}
