package chapter_05;

public class Prob08 {

	public static void main(String[] args) {
		mine(5, 10, 0.3);
	}

	public static void mine(int m, int n, double p) {
		int[][] random = new int[m][n]; // �� ĭ�� �Ҵ�Ǵ� ���� ��� (0.3���� ������ ���� ��ġ)
		String[][] matrix = new String[m][n]; // ���ڰ� �ִ�/���� ���Ҹ� ǥ���ϴ� ���
		int[][] count = new int[m][n]; // �̿��� ���� ������ ��Ÿ���� ���
		double prob = p * 100;

		// �� ���ҿ� ���� �� �ο�
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				random[i][j] = (int) (Math.random() * 100);
			}
		}

		// 30%(0.3)���� ���� ���� ���� ���ҿ� ���� ��ġ
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (random[i][j] < prob)
					matrix[i][j] = "*";
				else
					matrix[i][j] = "-";
			}
		}

		// ���� ���� ���θ� ��Ÿ���� 2���� �迭 ���
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		// �̿��� ���� ���� ���... ��� ������ �⺻���� 0���� �����ϱ�
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				count[i][j] = 0;
		}

		// �̿��� ���� ������ŭ ������ �� �����ϱ�
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j].equals("-")) { // ���ڸ� ������ ���� ���Ҹ� ���
					
					if (i == 0 && !(j == 0 || j == 9)) { // i = 0�� ��� ([0,0],[0,9] ����)
						for (int k = 0; k <= i + 1; k++) {
							for (int l = j - 1; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else if (j == 0 && !(i == 0 || i == 4)) { // j = 0�� ��� ([0,0],[4,0] ����)
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else if (i == 4 && !(j == 0 || j == 9)) { // i = 4�� ��� ([4,0],[4,9] ����)
						for (int k = i - 1; k <= i; k++) {
							for (int l = j - 1; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else if (j == 9 && !(i == 0 || i == 4)) { // j = 9�� ��� ([0,9],[4,9] ����)
						for (int k = i - 1; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 0 && j == 0) { // i = 0�̰� j = 0�� ���
						for (int k = i; k <= i + 1; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 4 && j == 0) { // i = 4�̰� j = 0�� ���
						for (int k = i - 1; k <= i; k++) {
							for (int l = j; l <= j + 1; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 0 && j == 9) { // i = 0�̰� j = 9�� ���
						for (int k = i; k <= i + 1; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}
					
					else if (i == 4 && j == 9) { // i = 4�̰� j = 9�� ���
						for (int k = i - 1; k <= i; k++) {
							for (int l = j - 1; l <= j; l++) {
								if (matrix[k][l].equals("*"))
									count[i][j]++;
							}
						}
					}

					else { // �⺻ ���̽�
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

		// ���ڸ� ������ ���� ���Ҹ� - ��ſ�
		// �̿��� ���� ������ ä�� 2���� �迭 ���
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
