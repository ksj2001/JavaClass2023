package collectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<UserVo> users = new ArrayList<>();
		users.add(new UserVo("ȫ�浿",34));
		users.add(new UserVo("������",21));
		users.add(new UserVo("���޷�",38));
		users.add(new UserVo("�ֹ���",16));
		users.add(new UserVo("�̼���",16));
		for(UserVo user : users) {
			System.out.println(user.getName()+":"+user.getAge());
		}
		System.out.println("==========");
		
		// 1�� : Collections.sort�� UserVo�� �ݵ�� Comparator�� implement�ϰ�
		// CompareTo �޼��带�������̵��Ѵ�.
		//Collections.sort(users);

		// 2�� : Collections.sort�� �͸� Ŭ������ �ۼ��Ѵ�.
		// Collections.sort�� �͸� Ŭ���� �ۼ� ���
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
		
		// 3�� : ArrayList.sort�� �͸� Ŭ������ �ۼ��Ѵ�.
		// �͸� �������̽�
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
