package megamart;

public class Basket {
	// 멤버 변수
	int[] price = {1500,2500,3000,4000,5000};
	String[] item = {"고등어","갈치","조기","삼치","병어"};
	int[][] cart = new int [100][3];
	
	//함수
	
	//추가
	public void initialize() { // cart 배열의 초기값 설정
		for(int i=0;i<item.length;i++) {
			cart[i][0] = i;
		}
		
		for(int i=0;i<item.length;i++) {
			cart[i][1] = price[i];
		}
		
		for(int i=0;i<item.length;i++) {
			cart[i][2] = 0;
		}
	}
	//추가
	
	public void count(int n) { // 선택한 상품을 세는 함수
		cart[n][2] += 1;
	}
	
	public void basket() { // 장바구니 출력 함수
		System.out.println("-------------------");
		System.out.println("품목    단가    수량  ");
		System.out.println("-------------------");
		for(int i=0;i<item.length;i++) {
			if(cart[i][2]!=0)
			System.out.println(item[cart[i][0]]+":\t"+cart[i][1]+"원\t"+cart[i][2]+"개");
		}
	}
}
