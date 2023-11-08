package megabox_Movie;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class AdminMenu {
	SimpleDateFormat sd = new SimpleDateFormat("yyyy.MM.dd(E)");
	DecimalFormat d = new DecimalFormat("#,###");
	MemberInfo mi = new MemberInfo();
	PointUseList pul = new PointUseList();
	MovieDTO md = new MovieDTO();
	
	public void showBookingList() { // 예매현황
		
	}
	
	public void showMemberList() { // 회원목록
		System.out.println(mi.memberList.size());
		System.out.println("\t\t\t--[전체 회원 내역]--");
		System.out.println("-------------------------------------------------");
		System.out.println("ID\tPW\t생년월일\t전화번호\t이메일\t포인트");
		for(int i=1;i<mi.memberList.size();i++) {
			System.out.print(mi.memberList.get(i).getId()+"\t");
			System.out.print(mi.memberList.get(i).getPw()+"\t");
			System.out.print(mi.memberList.get(i).getBirthDate()+"\t");
			System.out.print(mi.memberList.get(i).getPhoneNumber()+"\t");
			System.out.print(mi.memberList.get(i).getEmail()+"\t");
			System.out.println(d.format(mi.memberList.get(i).getPoint())+"\t");
		}
	}
	
	public void showPointUseList() { // 포인트이용현황
		System.out.println(pul.pointUseList.size());
		System.out.println("\t\t\t--[전체 포인트 이용 내역]--");
		System.out.println("--------------------------------------------");
		System.out.println("번호\t회원ID\t일자\t\t\t내용\t포인트");
		for(int i=0;i<pul.pointUseList.size();i++) {
			System.out.print("["+(i+1)+"]\t");
			System.out.print(pul.pointUseList.get(i).getId()+"\t");
			System.out.print(sd.format(pul.pointUseList.get(i).getDate())+"\t");
			System.out.print(pul.pointUseList.get(i).getDetail()+"\t");
			System.out.println(d.format(pul.pointUseList.get(i).getPoint())+"p");
		}
		System.out.println("--------------------------------------------");
	}
	
	public void showMovieList() { // 영화목록
		System.out.println("\t\t--[영화 목록]--");
		System.out.println("-------------------------------------------------");
		System.out.println("    영화이름\t상영일");
		for(int i=0;i<md.movieName.length;i++) {
			System.out.print("["+(i+1)+"]"+md.movieName[i]+"\t");
			System.out.println(sd.format(md.releaseDate[i]));
		}
		System.out.println("-------------------------------------------------");
	}
}
