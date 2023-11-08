package classpart07_re;

public class LogOut {
	if(loginCheck==-1) {
		System.out.println("로그인 후 이용 가능합니다.");
	}
	else {
		System.out.println("로그아웃 되었습니다.");
		loginCheck = -1;
		currentStatus = "로그아웃";
	}
}
