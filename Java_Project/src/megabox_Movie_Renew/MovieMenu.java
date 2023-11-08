package megabox_Movie_Renew;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MovieMenu extends MovieDTO{
	static ArrayList<UserDTO> userList = new ArrayList<>();
	static ArrayList<TicketingDTO> ticketingList = new ArrayList<>();
	static ArrayList<PointDTO> pointList = new ArrayList<>();
	
	SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-MM-dd(E)");
	SimpleDateFormat sd2 = new SimpleDateFormat("HH:mm");
	DecimalFormat d = new DecimalFormat("#,##0");
	Calendar cal = Calendar.getInstance();
	Scanner scan = new Scanner(System.in);
	
	int year = cal.get(Calendar.YEAR)-1900;
	int month = cal.get(Calendar.MONTH)+1;
	int date = cal.get(Calendar.DATE);
	int hour = cal.get(Calendar.HOUR);
	int minute = cal.get(Calendar.MINUTE);
	int second = cal.get(Calendar.SECOND);
	
	int log = -1;
	int select = 0; // 선택 or 이전
	int selectMovie = -1; // 예매할 영화
	int selectLocal = -1; // 지역선택
	int selectTheater = -1; // 극장선택
	int selectDay = -1; // 날짜선택
	int selectTime = -1; // 시간선택
	int movieEndTime = -1;
	int finalCheck = -1;
	
	public void bookMovie() { // 영화 예매하기
		finalCheck = -1;
		log = Menu.log;
		showMovie();
	}
	
	public void showMovie() { // 영화 정보 출력
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println("\t\t\t--[영화 목록]--");
				System.out.println("-------------------------------------------------");
				System.out.println("\t영화이름\t상영일");
				for(int i=0;i<movieName.length;i++) {
					System.out.print("["+(i+1)+"]"+movieName[i]+"\t");
					System.out.println(sd1.format(releaseDate[i]));
				}
				System.out.println("-------------------------------------------------");
				System.out.println("[1]예매");
				System.out.println("[2]이전");
				System.out.print("메뉴 선택: ");
				select = scan.nextInt();
				if(select==1) { 
					selectMovie=-1;
					while(selectMovie!=0 && selectMovie!=1 && selectMovie!=2) {
						System.out.print("예매할 영화: ");
						selectMovie = scan.nextInt()-1;
						if(selectMovie!=0 && selectMovie!=1 && selectMovie!=2) {
							System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
						}
					}
					showLocal();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
				}
			}
		}
	}
	
	public void showLocal() { // 지역 메뉴 출력
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[지역 선택]--");
				System.out.println("[1]서울");
				System.out.println("[2]경기도");
				System.out.println("[3]인천");
				System.out.println("-------------");
				System.out.println("[1]지역선택");
				System.out.println("[2]이전");
				System.out.print("메뉴 선택: ");
				select = scan.nextInt();
				if(select==1) {
					selectLocal=-1;
					while(selectLocal!=0 && selectLocal!=1 && selectLocal!=2) {
						System.out.print("지역 선택: ");
						selectLocal = scan.nextInt()-1;
						if(selectLocal!=0 && selectLocal!=1 && selectLocal!=2) {
							System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
						}
					}
					showTheater();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
				}
			}
		}
	}
	
	public void showTheater() { // 극장 메뉴 출력
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[극장 선택]--");
				if(selectLocal==0) {
					System.out.println("[1]강남");
					System.out.println("[2]목동");
					System.out.println("[3]성수");
				}
				else if(selectLocal==1) {
					System.out.println("[1]동탄");
					System.out.println("[2]분당");
					System.out.println("[3]일산");
				}
				else {
					System.out.println("[1]검단");
					System.out.println("[2]송도");
					System.out.println("[3]영종");
				}
				System.out.println("-------------");
				System.out.println("[1]극장선택");
				System.out.println("[2]이전");
				System.out.print("메뉴 선택: ");
				select = scan.nextInt();
				if(select==1) {
					selectTheater=-1;
					while(true) {
						System.out.print("극장 선택: ");
						selectTheater = scan.nextInt()-1;
						if(selectTheater!=0 && selectTheater!=1 && selectTheater!=2) {
							System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
						}
						else {
							if(selectLocal==0) {}
							else if(selectLocal==1) {selectTheater += 3;}
							else {selectTheater += 6;}
							break;
						}
					}
					showDay();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
				}
			}
		}
	}
	
	public void showDay() { // 날짜 메뉴 출력
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[날짜 선택]--");
				System.out.println("[1]"+day1+"일");
				System.out.println("[2]"+day2+"일");
				System.out.println("[3]"+day3+"일");
				System.out.println("-------------");
				System.out.println("[1]날짜선택");
				System.out.println("[2]이전");
				System.out.print("메뉴 선택: ");
				select = scan.nextInt();
				if(select==1) {
					selectDay=-1;
					while(selectDay!=0 && selectDay!=1 && selectDay!=2) {
						System.out.print("날짜 선택: ");
						selectDay = scan.nextInt()-1;
						if(selectDay!=0 && selectDay!=1 && selectDay!=2) {
							System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
						}
					}
					showTime();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
				}
			}
		}
	}
	
	public void showTime() { // 시간 메뉴 출력
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[시간 선택]--");
				if(selectDay==0) {
					if(selectMovie==0) {
						System.out.println("[1]"+sd2.format(time[0])+"~"+sd2.format(endTime[0]));
						System.out.println("[2]"+sd2.format(time[1])+"~"+sd2.format(endTime[1]));
						System.out.println("[3]"+sd2.format(time[2])+"~"+sd2.format(endTime[2]));
					}
					else if(selectMovie==1) {
						System.out.println("[1]"+sd2.format(time[0])+"~"+sd2.format(endTime[3]));
						System.out.println("[2]"+sd2.format(time[1])+"~"+sd2.format(endTime[4]));
						System.out.println("[3]"+sd2.format(time[2])+"~"+sd2.format(endTime[5]));
					}
					else {
						System.out.println("[1]"+sd2.format(time[0])+"~"+sd2.format(endTime[6]));
						System.out.println("[2]"+sd2.format(time[1])+"~"+sd2.format(endTime[7]));
						System.out.println("[3]"+sd2.format(time[2])+"~"+sd2.format(endTime[8]));
					}
				}
				else if(selectDay==1) {
					if(selectMovie==0) {
						System.out.println("[1]"+sd2.format(time[3])+"~"+sd2.format(endTime[9]));
						System.out.println("[2]"+sd2.format(time[4])+"~"+sd2.format(endTime[10]));
						System.out.println("[3]"+sd2.format(time[5])+"~"+sd2.format(endTime[11]));
					}
					else if(selectMovie==1) {
						System.out.println("[1]"+sd2.format(time[3])+"~"+sd2.format(endTime[12]));
						System.out.println("[2]"+sd2.format(time[4])+"~"+sd2.format(endTime[13]));
						System.out.println("[3]"+sd2.format(time[5])+"~"+sd2.format(endTime[14]));
					}
					else {
						System.out.println("[1]"+sd2.format(time[3])+"~"+sd2.format(endTime[15]));
						System.out.println("[2]"+sd2.format(time[4])+"~"+sd2.format(endTime[16]));
						System.out.println("[3]"+sd2.format(time[5])+"~"+sd2.format(endTime[17]));
					}
				}
				else {
					if(selectMovie==0) {
						System.out.println("[1]"+sd2.format(time[6])+"~"+sd2.format(endTime[18]));
						System.out.println("[2]"+sd2.format(time[7])+"~"+sd2.format(endTime[19]));
						System.out.println("[3]"+sd2.format(time[8])+"~"+sd2.format(endTime[20]));
					}
					else if(selectMovie==1) {
						System.out.println("[1]"+sd2.format(time[6])+"~"+sd2.format(endTime[21]));
						System.out.println("[2]"+sd2.format(time[7])+"~"+sd2.format(endTime[22]));
						System.out.println("[3]"+sd2.format(time[8])+"~"+sd2.format(endTime[23]));
					}
					else {
						System.out.println("[1]"+sd2.format(time[6])+"~"+sd2.format(endTime[24]));
						System.out.println("[2]"+sd2.format(time[7])+"~"+sd2.format(endTime[25]));
						System.out.println("[3]"+sd2.format(time[8])+"~"+sd2.format(endTime[26]));
					}
				}
				System.out.println("-------------");
				System.out.println("[1]시간선택");
				System.out.println("[2]이전");
				System.out.print("메뉴 선택: ");
				select = scan.nextInt();
				if(select==1) {
					selectTime=-1;
					while(true) {
						System.out.print("시간 선택: ");
						selectTime = scan.nextInt()-1;
						if(selectTime!=0 && selectTime!=1 && selectTime!=2) {
							System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
						}
						else {
							if(selectDay==0) {
								if(selectMovie==0) {movieEndTime = selectTime;}
								else if(selectMovie==1) {movieEndTime = selectTime+3;}
								else {movieEndTime = selectTime+6;}
							}
							else if(selectDay==1) {
								selectTime += 3;
								if(selectMovie==0) {movieEndTime = selectTime+6;}
								else if(selectMovie==1) {movieEndTime = selectTime+9;}
								else {movieEndTime = selectTime+12;}
							}
							else {
								selectTime += 6;
								if(selectMovie==0) {movieEndTime = selectTime+12;}
								else if(selectMovie==1) {movieEndTime = selectTime+15;}
								else {movieEndTime = selectTime+18;}
							}
							break;
						}
					}
					reserveSeat();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
				}
			}
		}
	}
	
	public void reserveSeat() { // 좌석 예매하기
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				convertReservedSeats();
				System.out.println();
				printScreen();
				revenue = 0;
				System.out.print("인원 선택(1~8)(0.이전): ");
				personnel = scan.nextInt();
				if(personnel==0) {
					break;
				}
				else if(personnel>=1 && personnel<=8) {
					// 좌석번호가 범위를 초과할 때 예외처리를 해주지 않았음.
					if(personnel==1) { // 1명일 때
						oneBook();
					}
					else if(personnel % 2 == 1) { // 홀수일 때 (1명일 경우 제외)
						oddBook();
					}
					else { // 짝수일 때
						evenBook();
					}
					printScreen();
					System.out.println("좌석선택이 완료되었습니다.");
					while(true) {
						System.out.println("[1]예매하기");
						System.out.println("[2]좌석 다시 선택");
						System.out.print("메뉴 선택: ");
						select = scan.nextInt();
						if(select==1) {
							showBookInfo(); // 예매정보 출력
							break;
						}
						else if(select==2) {
							cancelSeat();
							break;
						}
						else {
							System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
						}
					}
				}
				else {
					System.out.println("범위를 초과한 인원입니다. 다시 입력해주십시오.");
				}
			}
		}
	}
	
	public void showBookInfo() { // 예매정보 출력하기
		int usedPoint = 0; // 사용한 포인트
		int inputPoint = 0; // 사용할 포인트
		int userPoint = userList.get(log).getPoint(); // 유저가 보유중인 포인트
		
		while(true) {
			System.out.println();
			System.out.println("------------------------");
			System.out.println(movieName[selectMovie]);
			System.out.println(theater[selectTheater]+"("+local[selectLocal]+")");
			System.out.println(sd1.format(time[selectTime])+" | "
							  +sd2.format(time[selectTime])+"~"+sd2.format(endTime[movieEndTime]));
			System.out.println("성인 "+(personnel)+"명");
			System.out.println("------------------------");
			System.out.println("금액 :  \t\t"+revenue+"원");
			System.out.println("포인트 :\t\t-"+usedPoint+"p");
			// mi.memberList.get(mi.log).getPoint() : 로그인 되어있는 유저의 보유 포인트 
			
			System.out.println("[1]결제");
			System.out.println("[2]포인트 사용");
			System.out.println("[3]좌석 다시 선택");
			System.out.print("메뉴 선택: ");
			select = scan.nextInt();
			if(select==1) {
				System.out.println("결제가 완료되었습니다.");
				if(usedPoint!=0) {
					// 포인트 사용내역 추가
					addList(new PointDTO(userList.get(log).getId(),new Date(year,month-1,date,hour,minute,second),
										 "예매사용",usedPoint,log));
				}
				System.out.println("영화예매로 "+d.format((revenue-usedPoint)*0.05)+"p가 적립되었습니다!");
				userPoint += revenue*0.05;
				userList.get(log).setPoint(userPoint); // 보유중인 포인트 값 수정
				// 포인트 적립내역 추가
				addList(new PointDTO(userList.get(log).getId(),new Date(year,month-1,date,hour,minute,second),
						 "예매적립",(int)((revenue-usedPoint)*0.05),log));
				// 예매내역 추가
				addList(new TicketingDTO(userList.get(log).getId(),movieName[selectMovie],
								  new Date(year,month-1,date,hour,minute,second),
							      local[selectLocal],theater[selectTheater],
							      time[selectTime],endTime[movieEndTime],
							      personnel,(revenue-usedPoint),usedPoint));
				// 바로 기본메뉴로 돌아가도록 설정
				finalCheck = 0;
				break;
			}
			else if(select==2) {
				System.out.print("사용할 포인트 입력 : ");
				inputPoint = scan.nextInt(); // 사용할 포인트
				if(inputPoint>userPoint) {
					System.out.println("포인트가 부족합니다.");
				}
				else{
					System.out.println("포인트가 사용되었습니다.");
					usedPoint += inputPoint; 
					userPoint -= inputPoint;
				}
			}
			else if(select==3) {
				cancelSeat();
				break;
			}
			else {
				System.out.println("유효한 메뉴가 아닙니다. 다시 선택해주십시오.");
			}
		}
	}
	
	public static void addList(UserDTO dto) {
		userList.add(dto);
	}
	
	public static void addList(TicketingDTO dto) {
		ticketingList.add(dto);
	}
	
	public static void addList(PointDTO dto) {
		pointList.add(dto);
	}
}
