package megabox_Movie;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class AdminMenu {
	SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd(E)");
	DecimalFormat d = new DecimalFormat("#,###");
	MemberInfo mi = new MemberInfo();
	PointUseList pul = new PointUseList();
	MovieDTO md = new MovieDTO();
	
	public void showBookingList() { // ������Ȳ
		
	}
	
	public void showMemberList() { // ȸ�����
		System.out.println(mi.memberList.size());
		System.out.println("\t\t\t--[��ü ȸ�� ����]--");
		System.out.println("-------------------------------------------------");
		System.out.println("ID\tPW\t�������\t��ȭ��ȣ\t�̸���\t����Ʈ");
		for(int i=1;i<mi.memberList.size();i++) {
			System.out.print(mi.memberList.get(i).getId()+"\t");
			System.out.print(mi.memberList.get(i).getPw()+"\t");
			System.out.print(mi.memberList.get(i).getBirthDate()+"\t");
			System.out.print(mi.memberList.get(i).getPhoneNumber()+"\t");
			System.out.print(mi.memberList.get(i).getEmail()+"\t");
			System.out.println(d.format(mi.memberList.get(i).getPoint())+"\t");
		}
	}
	
	public void showPointUseList() { // ����Ʈ�̿���Ȳ
		System.out.println(pul.pointUseList.size());
		System.out.println("\t\t\t--[��ü ����Ʈ �̿� ����]--");
		System.out.println("--------------------------------------------");
		System.out.println("��ȣ\tȸ��ID\t����\t\t\t����\t����Ʈ");
		for(int i=0;i<pul.pointUseList.size();i++) {
			System.out.print("["+(i+1)+"]\t");
			System.out.print(pul.pointUseList.get(i).getId()+"\t");
			System.out.print(sd.format(pul.pointUseList.get(i).getDate())+"\t");
			System.out.print(pul.pointUseList.get(i).getDetail()+"\t");
			System.out.println(d.format(pul.pointUseList.get(i).getPoint())+"p");
		}
		System.out.println("--------------------------------------------");
	}
	
	public void showMovieList() { // ��ȭ���
		System.out.println("\t\t--[��ȭ ���]--");
		System.out.println("-------------------------------------------------");
		System.out.println("    ��ȭ�̸�\t����");
		for(int i=0;i<md.movieName.length;i++) {
			System.out.print("["+(i+1)+"]"+md.movieName[i]+"\t");
			System.out.println(sd.format(md.releaseDate[i]));
		}
		System.out.println("-------------------------------------------------");
	}
}
