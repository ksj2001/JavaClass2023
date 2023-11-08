package arraylist;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(); // ArrayList 배열 생성
		// add(값)메서드는 값 추가
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		System.out.println(num);
		
		// add(index, 값)메서드는 삽입
		num.add(1, 60);
		System.out.println(num);
		
		// remove(index)메서드는 삭제
		num.remove(1);
		System.out.println(num);
		
		// get(index)메서드는 인덱스의 값을 추출
		System.out.println(num.get(3));
		
		// set(index, 값)메서드는 수정
		num.set(4, 55);
		System.out.println(num);
		
		// size()메서드는 ArrayList의 크기
		System.out.println(num.size());
		
		// indexOf(값)메서드는 배열의 값이 존재하면 그 값이 있는 인덱스번호가 출력됨
		// 값이 존재하지 않으면 -1이 출력
		System.out.println(num.indexOf(25));
		System.out.println(num.indexOf(55));
		
		// 배열 출력할 때 for문
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i));
		}
		
		// * for(자료형 변수명 : 배열 or ArrayList)
		//        반복할 문장
		System.out.println("============");
		for(int nu:num) {
			System.out.print(nu+" ");
		}
		System.out.println();
		
		// clear()메서드는 배열 초기화
		num.clear();
		System.out.println(num);
		
		// isEmpty()메서드는 배열이 공백이면 TRUE
		if(num.isEmpty()) {
			System.out.println("배열의 값이 존재하지 않습니다.");
		}
	}

}
