package exception;

public class IdFormatExceptionTest {

	String userId;
	
	public String getUserId() {
		return userId;
	}

	// userId�� null�� ���, userId�� ���ڼ��� 8���� �۰ų� 20���� ũ�� Exception ó��
	public void setUserId(String userId) throws IdFormatException  {
		if(userId == null) {
			// throw�� ���ܸ� �߻���Ű�� Ű����
			throw new IdFormatException("userId�� null �Դϴ�.");
		} else if(userId.length()<8 || userId.length()>20) {
			throw new IdFormatException("userId�� ���ڴ� 8���� �۰ų� 20�� �ʰ��� �� �����ϴ�.");
		}
		this.userId = userId;
	}

	public static void main(String[] args) {
		
		IdFormatExceptionTest ife = new IdFormatExceptionTest();
		ife.userId = null;
		
		try {
	    	ife.setUserId(ife.userId);
		} catch(IdFormatException i) {
			System.out.println(i);
		}
		
		ife.userId ="1234567";
		try {
			ife.setUserId(ife.userId);
		} catch(IdFormatException i) {
			System.out.println(i);
		}
	}
	
}
