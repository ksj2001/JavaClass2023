package collectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<UserVo> users = new ArrayList<>();
		users.add(new UserVo("홍길동",34));
		users.add(new UserVo("개나리",21));
		users.add(new UserVo("진달래",38));
		users.add(new UserVo("최백합",16));
		users.add(new UserVo("이순신",16));
		for(UserVo user : users) {
			System.out.println(user.getName()+":"+user.getAge());
		}
		System.out.println("==========");
		
		// 1번 : Collections.sort는 UserVo에 반드시 Comparator를 implement하고
		// CompareTo 메서드를오버라이딩한다.
		//Collections.sort(users);

		// 2번 : Collections.sort를 익명 클래스로 작성한다.
		// Collections.sort의 익명 클래스 작성 방법
		Collections.sort(users, new Comparator<UserVo>(){
			@Override
			public int compare(UserVo o1, UserVo o2) {
				if(o1.getAge() == o2.getAge()) {
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getAge() - o2.getAge();
			}
		});
		for(UserVo user : users) {
			System.out.println(user.getName()+":"+user.getAge());
		}
		
		// 3번 : ArrayList.sort를 익명 클래스로 작성한다.
		// 익명 인터페이스
		users.sort(new Comparator<UserVo>() {

			@Override
			public int compare(UserVo o1, UserVo o2) {
				return o2.getAge() - o1.getAge();
			}
		});

		System.out.println("==========");
		for(UserVo user : users) {
			System.out.println(user.getName()+":"+user.getAge());
		}
		
		users.sort((o1,o2) -> o1.getAge() - o2.getAge());
		System.out.println(users);
	}
}
