package multi_array;
import java.util.*;
public class Multi_ArrayExample12 {
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
		for(int i=0;i<apt.length;i++) {
			for(int j=0;j<apt[0].length;j++) {
				System.out.print(apt[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<pay.length;i++) {
			for(int j=0;j<pay[0].length;j++) {
				System.out.print(pay[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int ho1 = 0; // 입력하는 호수 1
		int ho1_index_i = 0; // 호수 1의 위치(세로(ex.101,201,301), i)
		int ho1_index_j = 0; // 호수 1의 위치(가로(ex.101,102,103), j)
		System.out.print("호수 1 입력 : ");
		ho1 = scan.nextInt();
		
		int ho2 = 0; // 입력하는 호수 2
		int ho2_index_i = 0; // 호수 2의 위치(세로(ex.101,201,301), i)
		int ho2_index_j = 0; // 호수 2의 위치(가로(ex.101,102,103), j)
		System.out.print("호수 2 입력 : ");
		ho2 = scan.nextInt();
		System.out.println();
		
		int temp = 0; // 임시값
		
		for(int i=0;i<apt.length;i++) {
			for(int j=0;j<apt[0].length;j++) {				
				if(ho1==apt[i][j]) {
					ho1_index_i = i;
					ho1_index_j = j;
				}
				else if(ho2==apt[i][j]) {
					ho2_index_i = i;
					ho2_index_j = j;
				}
			}
		}
		
		temp = pay[ho1_index_i][ho1_index_j];
		pay[ho1_index_i][ho1_index_j] = pay[ho2_index_i][ho2_index_j];
		pay[ho2_index_i][ho2_index_j] = temp;
		
		for(int i=0;i<pay.length;i++) {
			for(int j=0;j<pay[0].length;j++) {
				System.out.print(pay[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
