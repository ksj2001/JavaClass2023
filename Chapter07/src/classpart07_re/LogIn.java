package classpart07_re;

public class Login {
	ClassEx07 arracc;
	
	if(loginCheck==-1) {
		System.out.print("ID�Է� : ");
		inputAcc = scan.next();
		System.out.print("PW�Է� : ");
		inputPw = scan.next();
		for(int i=0;i<arAcc.length;i++) {
			if(arAcc[i].equals(inputAcc)&&arPw[i].equals(inputPw)) {
				System.out.println(arAcc[i]+"��, ȯ���մϴ�.");
				loginCheck = i;
				currentStatus = arAcc[loginCheck]+" �α���";
			}
		}
		if(loginCheck==-1) {
			System.out.println("ID�� PW�� Ȯ�����ּ���.");
		}
	}
	else {
		System.out.println("�̹� �α��� �� �����Դϴ�.");
	}
}


