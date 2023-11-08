package exception;
// 사용자 정의 Exception은 반드시 기존 jdk의 Exception 중 하나를 상속받아야 한다.
public class IdFormatException extends Exception {
	
	public IdFormatException(String message) {
		super(message);
	}
}
