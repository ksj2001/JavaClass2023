package stringtoken;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str1 = "java android";
           String str2 = "java!android";
           String str3 = "java-android!fun";
           
           // 첫 번째 방식 : 문자열이 공백으로 나누어져 있을 때만 사용 가능
           StringTokenizer st = new StringTokenizer(str1);
           // nextToken 메서드 : 다음 글자를 토큰화
           // trim 메서드 : 공백을 제거하고 출력
           System.out.println(st.nextToken().trim());
           System.out.println(st.nextToken().trim());
           System.out.println();
           // 두 번째 방식 : 특수문자로 작성된 문자를 분리할 때 사용
           StringTokenizer st2 = new StringTokenizer(str3,"-!");
           for(int i=0;i<3;i++) {
        	   System.out.println(st2.nextToken().trim());
           }
           System.out.println();
           // 세 번째 방식 : 특수문자도 토큰으로 출력
           StringTokenizer st3 = new StringTokenizer(str3,"-!",true);
           for(int i=0;i<5;i++) {
        	   System.out.println(st3.nextToken().trim());
           }
	}

}
