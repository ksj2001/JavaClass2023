package chapter_06;

public class Multi_ArrayExample08 {

	public static void main(String[] args) {
		int[][] arr = { { 101, 102, 103, 104 }, { 201, 202, 203, 204 }, { 301, 302, 303, 304 } };
		int[] line = new int[3];
		int[] row = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				line[i] += arr[i][j];
				row[j] += arr[i][j];
			}
		}
		
		System.out.print("가로 합 : ");
		for (int i = 0; i < line.length; i++) {
			System.out.print(line[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("세로 합 : ");
		for (int i = 0; i < row.length; i++) {
			System.out.print(row[i] + " ");
		}
	}

}
