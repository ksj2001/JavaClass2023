package chapter_05;

public class Prob06 {

	public static void main(String[] args) {
		int[] arr = {13,87,65,29,42};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<reverse(arr).length;i++) {
			System.out.print(reverse(arr)[i]+" ");
		}
	}
	
	public static int[] reverse(int[] org) {
		int[] temp = new int[org.length];
		
		/*
		for(int i=0;i<org.length;i++) {
			temp[i] = org[org.length-(i+1)];
			org[org.length-(i+1)] = org[i];
			org[i] = temp[i];
		}
		*/
		
		for(int i=0;i<org.length;i++) {
			temp[i] = org[org.length-(i+1)];
		}
		
		return temp;
	}

}
