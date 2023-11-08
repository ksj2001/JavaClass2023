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
	int select = 0; // ���� or ����
	int selectMovie = -1; // ������ ��ȭ
	int selectLocal = -1; // ��������
	int selectTheater = -1; // ���弱��
	int selectDay = -1; // ��¥����
	int selectTime = -1; // �ð�����
	int movieEndTime = -1;
	int finalCheck = -1;
	
	public void bookMovie() { // ��ȭ �����ϱ�
		finalCheck = -1;
		log = Menu.log;
		showMovie();
	}
	
	public void showMovie() { // ��ȭ ���� ���
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println("\t\t\t--[��ȭ ���]--");
				System.out.println("-------------------------------------------------");
				System.out.println("\t��ȭ�̸�\t����");
				for(int i=0;i<movieName.length;i++) {
					System.out.print("["+(i+1)+"]"+movieName[i]+"\t");
					System.out.println(sd1.format(releaseDate[i]));
				}
				System.out.println("-------------------------------------------------");
				System.out.println("[1]����");
				System.out.println("[2]����");
				System.out.print("�޴� ����: ");
				select = scan.nextInt();
				if(select==1) { 
					selectMovie=-1;
					while(selectMovie!=0 && selectMovie!=1 && selectMovie!=2) {
						System.out.print("������ ��ȭ: ");
						selectMovie = scan.nextInt()-1;
						if(selectMovie!=0 && selectMovie!=1 && selectMovie!=2) {
							System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
						}
					}
					showLocal();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
				}
			}
		}
	}
	
	public void showLocal() { // ���� �޴� ���
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[���� ����]--");
				System.out.println("[1]����");
				System.out.println("[2]��⵵");
				System.out.println("[3]��õ");
				System.out.println("-------------");
				System.out.println("[1]��������");
				System.out.println("[2]����");
				System.out.print("�޴� ����: ");
				select = scan.nextInt();
				if(select==1) {
					selectLocal=-1;
					while(selectLocal!=0 && selectLocal!=1 && selectLocal!=2) {
						System.out.print("���� ����: ");
						selectLocal = scan.nextInt()-1;
						if(selectLocal!=0 && selectLocal!=1 && selectLocal!=2) {
							System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
						}
					}
					showTheater();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
				}
			}
		}
	}
	
	public void showTheater() { // ���� �޴� ���
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[���� ����]--");
				if(selectLocal==0) {
					System.out.println("[1]����");
					System.out.println("[2]��");
					System.out.println("[3]����");
				}
				else if(selectLocal==1) {
					System.out.println("[1]��ź");
					System.out.println("[2]�д�");
					System.out.println("[3]�ϻ�");
				}
				else {
					System.out.println("[1]�˴�");
					System.out.println("[2]�۵�");
					System.out.println("[3]����");
				}
				System.out.println("-------------");
				System.out.println("[1]���弱��");
				System.out.println("[2]����");
				System.out.print("�޴� ����: ");
				select = scan.nextInt();
				if(select==1) {
					selectTheater=-1;
					while(true) {
						System.out.print("���� ����: ");
						selectTheater = scan.nextInt()-1;
						if(selectTheater!=0 && selectTheater!=1 && selectTheater!=2) {
							System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
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
					System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
				}
			}
		}
	}
	
	public void showDay() { // ��¥ �޴� ���
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[��¥ ����]--");
				System.out.println("[1]"+day1+"��");
				System.out.println("[2]"+day2+"��");
				System.out.println("[3]"+day3+"��");
				System.out.println("-------------");
				System.out.println("[1]��¥����");
				System.out.println("[2]����");
				System.out.print("�޴� ����: ");
				select = scan.nextInt();
				if(select==1) {
					selectDay=-1;
					while(selectDay!=0 && selectDay!=1 && selectDay!=2) {
						System.out.print("��¥ ����: ");
						selectDay = scan.nextInt()-1;
						if(selectDay!=0 && selectDay!=1 && selectDay!=2) {
							System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
						}
					}
					showTime();
				}
				else if(select==2) {
					break;
				}
				else {
					System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
				}
			}
		}
	}
	
	public void showTime() { // �ð� �޴� ���
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				System.out.println();
				System.out.println("--[�ð� ����]--");
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
				System.out.println("[1]�ð�����");
				System.out.println("[2]����");
				System.out.print("�޴� ����: ");
				select = scan.nextInt();
				if(select==1) {
					selectTime=-1;
					while(true) {
						System.out.print("�ð� ����: ");
						selectTime = scan.nextInt()-1;
						if(selectTime!=0 && selectTime!=1 && selectTime!=2) {
							System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
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
					System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
				}
			}
		}
	}
	
	public void reserveSeat() { // �¼� �����ϱ�
		while(true) {
			if(finalCheck==0) {
				break;
			}
			else {
				convertReservedSeats();
				System.out.println();
				printScreen();
				revenue = 0;
				System.out.print("�ο� ����(1~8)(0.����): ");
				personnel = scan.nextInt();
				if(personnel==0) {
					break;
				}
				else if(personnel>=1 && personnel<=8) {
					// �¼���ȣ�� ������ �ʰ��� �� ����ó���� ������ �ʾ���.
					if(personnel==1) { // 1���� ��
						oneBook();
					}
					else if(personnel % 2 == 1) { // Ȧ���� �� (1���� ��� ����)
						oddBook();
					}
					else { // ¦���� ��
						evenBook();
					}
					printScreen();
					System.out.println("�¼������� �Ϸ�Ǿ����ϴ�.");
					while(true) {
						System.out.println("[1]�����ϱ�");
						System.out.println("[2]�¼� �ٽ� ����");
						System.out.print("�޴� ����: ");
						select = scan.nextInt();
						if(select==1) {
							showBookInfo(); // �������� ���
							break;
						}
						else if(select==2) {
							cancelSeat();
							break;
						}
						else {
							System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
						}
					}
				}
				else {
					System.out.println("������ �ʰ��� �ο��Դϴ�. �ٽ� �Է����ֽʽÿ�.");
				}
			}
		}
	}
	
	public void showBookInfo() { // �������� ����ϱ�
		int usedPoint = 0; // ����� ����Ʈ
		int inputPoint = 0; // ����� ����Ʈ
		int userPoint = userList.get(log).getPoint(); // ������ �������� ����Ʈ
		
		while(true) {
			System.out.println();
			System.out.println("------------------------");
			System.out.println(movieName[selectMovie]);
			System.out.println(theater[selectTheater]+"("+local[selectLocal]+")");
			System.out.println(sd1.format(time[selectTime])+" | "
							  +sd2.format(time[selectTime])+"~"+sd2.format(endTime[movieEndTime]));
			System.out.println("���� "+(personnel)+"��");
			System.out.println("------------------------");
			System.out.println("�ݾ� :  \t\t"+revenue+"��");
			System.out.println("����Ʈ :\t\t-"+usedPoint+"p");
			// mi.memberList.get(mi.log).getPoint() : �α��� �Ǿ��ִ� ������ ���� ����Ʈ 
			
			System.out.println("[1]����");
			System.out.println("[2]����Ʈ ���");
			System.out.println("[3]�¼� �ٽ� ����");
			System.out.print("�޴� ����: ");
			select = scan.nextInt();
			if(select==1) {
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				if(usedPoint!=0) {
					// ����Ʈ ��볻�� �߰�
					addList(new PointDTO(userList.get(log).getId(),new Date(year,month-1,date,hour,minute,second),
										 "���Ż��",usedPoint,log));
				}
				System.out.println("��ȭ���ŷ� "+d.format((revenue-usedPoint)*0.05)+"p�� �����Ǿ����ϴ�!");
				userPoint += revenue*0.05;
				userList.get(log).setPoint(userPoint); // �������� ����Ʈ �� ����
				// ����Ʈ �������� �߰�
				addList(new PointDTO(userList.get(log).getId(),new Date(year,month-1,date,hour,minute,second),
						 "��������",(int)((revenue-usedPoint)*0.05),log));
				// ���ų��� �߰�
				addList(new TicketingDTO(userList.get(log).getId(),movieName[selectMovie],
								  new Date(year,month-1,date,hour,minute,second),
							      local[selectLocal],theater[selectTheater],
							      time[selectTime],endTime[movieEndTime],
							      personnel,(revenue-usedPoint),usedPoint));
				// �ٷ� �⺻�޴��� ���ư����� ����
				finalCheck = 0;
				break;
			}
			else if(select==2) {
				System.out.print("����� ����Ʈ �Է� : ");
				inputPoint = scan.nextInt(); // ����� ����Ʈ
				if(inputPoint>userPoint) {
					System.out.println("����Ʈ�� �����մϴ�.");
				}
				else{
					System.out.println("����Ʈ�� ���Ǿ����ϴ�.");
					usedPoint += inputPoint; 
					userPoint -= inputPoint;
				}
			}
			else if(select==3) {
				cancelSeat();
				break;
			}
			else {
				System.out.println("��ȿ�� �޴��� �ƴմϴ�. �ٽ� �������ֽʽÿ�.");
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
