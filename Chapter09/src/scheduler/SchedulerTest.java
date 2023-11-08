package scheduler;
import java.util.*;
public class SchedulerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("상담을 선택하세요 : (R, L, P)");
		String str = scan.next();
		Scheduler sch = null;
		if(str.equalsIgnoreCase("R")) {
			sch = new RoundRobin();
		}
		else if(str.equals("L")) {
			sch = new LeastJob();
		}
		else if(str.equals("P")) {
			sch = new PriorityAllocation();
		}
		else System.out.println("ERROR");
		
		sch.getNextCall();
		sch.sendCallToAgent();
		scan.close();
	}

}
