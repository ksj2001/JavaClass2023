package exception;

public class IdFormatExceptionTest {

	String userId;
	
	public String getUserId() {
		return userId;
	}

	// userId가 null인 경우, userId의 글자수가 8보다 작거나 20보다 크면 Exception 처리
	public void setUserId(String userId) throws IdFormatException  {
		if(userId == null) {
			// throw는 예외를 발생시키는 키워드
			throw new IdFormatException("userId가 null 입니다.");
		} else if(userId.length()<8 || userId.length()>20) {
			throw new IdFormatException("userId의 문자는 8보다 작거나 20을 초과할 수 없습니다.");
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
