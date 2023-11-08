package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int[] arr = null;
		
		try {
			// 수행할 구문은 반드시 try 안에 들어가야 한다.
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// try 구문이 오류가 났을 때 출력된다.
			System.out.println(e.toString());
			return;
		} catch(Exception e) {  // Exception 클래스는 맨 마지막 catch에 집어넣는다.
			// 최상위 클래스이기 때문에 맨 위에 집어넣으면 하위 클래스들을 인식할 수 없다.
			System.out.println(e);
			return;
		} finally {
			System.out.println("무조건 출력");
		}
		System.out.println("end");
	}

}
