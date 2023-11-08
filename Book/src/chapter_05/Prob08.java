package chapter_05;

public class Prob08 {

	public static void main(String[] args) {
		mine(5, 10, 0.3);
	}

	public static void mine(int m, int n, double p) {
		int[][] random = new int[m][n]; // 각 칸에 할당되는 값의 행렬 (0.3보다 낮으면 지뢰 설치)
		String[][] matrix = new String[m][n]; // 지뢰가 있는/없는 원소를 표현하는 행렬
		int[][] count = new int[m][n]; // 이웃한 지뢰 개수를 나타내는 행렬
		double prob = p * 100;

		// 각 원소에 랜덤 값 부여
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				random[i][j] = (int) (Math.random() * 100);
			}
		}

		// 30%(0.3)보다 낮은 값을 가진 원소에 지뢰 설치
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (random[i][j] < prob)
					matrix[i][j] = "*";
				else
					matrix[i][j] = "-";
			}
		}

		// 지뢰 숨김 여부를 나타내는 2차원 배열 출력
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		// 이웃한 지뢰 개수 행렬... 모든 원소의 기본값을 0으로 설정하기
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				count[i][j] = 0;
		}

		// 이웃한 지뢰 개수만큼 원소의 값 설정하기
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j].equals("-")) { // 지뢰를 숨기지 않은 원소만 취급
					
					if (i == 0 && !(j == 0 || j == 9)) { // i = 0인 경우 ([0,0],[0,9] 제외)
						for (int k = 0; k <= i + 1; k++) {
							for (int l = j - 1; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else if (j == 0 && !(i == 0 || i == 4)) { // j = 0인 경우 ([0,0],[4,0] 제외)
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else if (i == 4 && !(j == 0 || j == 9)) { // i = 4인 경우 ([4,0],[4,9] 제외)
						for (int k = i - 1; k <= i; k++) {
							for (int l = j - 1; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else if (j == 9 && !(i == 0 || i == 4)) { // j = 9인 경우 ([0,9],[4,9] 제외)
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 0 && j == 0) { // i = 0이고 j = 0인 경우
						for (int k = i; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 4 && j == 0) { // i = 4이고 j = 0인 경우
						for (int k = i - 1; k <= i; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 0 && j == 9) { // i = 0이고 j = 9인 경우
						for (int k = i; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 4 && j == 9) { // i = 4이고 j = 9인 경우
						for (int k = i - 1; k <= i; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else { // 기본 케이스
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j - 1; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
				}	
			}
		}

		// 지뢰를 숨기지 않은 원소를 - 대신에
		// 이웃한 지뢰 개수로 채운 2차원 배열 출력
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j].equals("*"))
					System.out.print(matrix[i][j]);
				else
					System.out.print(count[i][j]);
			}
			System.out.println();
		}

	}

}
