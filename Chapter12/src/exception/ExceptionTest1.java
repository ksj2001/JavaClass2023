package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		int[] arr = null;
		
		try {
			// ������ ������ �ݵ�� try �ȿ� ���� �Ѵ�.
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// try ������ ������ ���� �� ��µȴ�.
			System.out.println(e.toString());
			return;
		} catch(Exception e) {  // Exception Ŭ������ �� ������ catch�� ����ִ´�.
			// �ֻ��� Ŭ�����̱� ������ �� ���� ��������� ���� Ŭ�������� �ν��� �� ����.
			System.out.println(e);
			return;
		} finally {
			System.out.println("������ ���");
		}
		System.out.println("end");
	}

}
