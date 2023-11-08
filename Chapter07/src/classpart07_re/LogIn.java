package classpart07_re;

public class Login {
	ClassEx07 arracc;
	
	if(loginCheck==-1) {
		System.out.print("ID입력 : ");
		inputAcc = scan.next();
		System.out.print("PW입력 : ");
		inputPw = scan.next();
		for(int i=0;i<arAcc.length;i++) {
			if(arAcc[i].equals(inputAcc)&&arPw[i].equals(inputPw)) {
				System.out.println(arAcc[i]+"님, 환영합니다.");
				loginCheck = i;
				currentStatus = arAcc[loginCheck]+" 로그인";
			}
		}
		if(loginCheck==-1) {
			System.out.println("ID와 PW를 확인해주세요.");
		}
	}
	else {
		System.out.println("이미 로그인 된 상태입니다.");
	}
}


