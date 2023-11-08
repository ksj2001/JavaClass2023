package spcMaster2019;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Proj_18114 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int combCheck = 0; // 조건을 만족하는 조합의 유무를 구분하는 키값 (기본 : 0)
		String input1 = scan.nextLine(); // 첫 번째 줄 입력
		StringTokenizer st1 = new StringTokenizer(input1);
		int num = Integer.parseInt(st1.nextToken().trim()); // 물건의 개수
		int standardWeight = Integer.parseInt(st1.nextToken().trim()); // 제시하는 무게
		String input2 = scan.nextLine(); // 두 번째 줄 입력
		int[] weightArr = new int[num]; // 물건들의 무게로 이루어진 배열
		StringTokenizer st2 = new StringTokenizer(input2);
		for(int i=0;i<num;i++) {
			weightArr[i] = Integer.parseInt(st2.nextToken().trim());
		}
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				for(int k=0;k<num;k++) {
					if(weightArr[i]==standardWeight) { // 물건 한 개와 비교
						combCheck = 1;
					}
					else if(weightArr[i]!=weightArr[j]) { // 중복 예외처리
						if(weightArr[i]+weightArr[j]==standardWeight) { // 물건 두 개와 비교
							combCheck = 1;
						}
					}
					else if((weightArr[i]!=weightArr[j])&&(weightArr[j]!=weightArr[k])&&(weightArr[i]!=weightArr[k])) { // 중복 예외처리
						if(weightArr[i]+weightArr[j]+weightArr[k]==standardWeight) { // 물건 세 개와 비교
							combCheck = 1;
						}
					}
				}
			}
		}
		System.out.println(combCheck);
		scan.close();
	}
}
