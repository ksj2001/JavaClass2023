package array;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = new int[3]; // �迭�� �����ϴ� ���
		System.out.println(arr); // [I@626b2d4a : arr�� �ּ�
		int[] arr1 = null; // null = ���� ����
		System.out.println(arr1);
		int[] arr2 = null;
		int[] arr3 = {10,20,30}; // �迭 ����� ���ÿ� �ʱ�ȭ
		
		double[] arr4 = new double[3];
		char[] arr5 = new char[26];
		int alpha = 65;
		for(int i=0;i<arr5.length;i++) {
			//arr5[i] = (char)alpha;
			//alpha++;
			arr5[i] = (char)(65 + i);

			System.out.println("���ĺ� ���: "+arr5[i]);
		}
        String[] arr6 = {"������","���޷�","ȫ�浿"};
        for(int i=0;i<3;i++) {
        	System.out.println(arr6[i]);
        }
		
		
		for(int i=0;i<3;i++) {
			arr4[i] = 10 * (i+1);
			System.out.println(arr4[i]);
		}
		// �迭�� �Լ� ����
		System.out.println(arr.length); // �迭�� ���̸� ��Ÿ���� �Լ�
		System.out.println(Arrays.toString(arr)); // �迭�� ��Ҹ� ��Ÿ���� �Լ�
		arr1 = Arrays.copyOf(arr,arr.length);
		System.out.println(arr1); // �迭�� �����ϴ� �Լ� [I@5e91993f copyOf �Լ��� ���ο� �迭�� �����.
		arr2 = arr;
		System.out.println(arr2); //[I@626b2d4a
		System.out.println(arr3[0]);
	}

}
