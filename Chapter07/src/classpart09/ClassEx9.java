package classpart09;
import java.util.*;
public class ClassEx9 {
	Random ran = new Random();
	//전역변수
	int total = 0;
	double average = 0.0;
	int first = 0;
	int last = 100;
	//메서드
	public void test1(int[] x) {
		for(int i=0;i<x.length;i++) {
			x[i] = ran.nextInt(100)+1;
		}
		System.out.println();
	}
	public int scoreTotal(int[] x) {
		for(int i=0;i<x.length;i++) {
			total += x[i];
		}
		return total;
	}
	public double scoreAverage(int[] x) {
		average = (double)total / (double)x.length;
		return average;
	}
	public int searchFirst(int[] x) {
		for(int i=0;i<x.length;i++) {
			if(x[i]>first)
			first = x[i];
		}
		return first;
	}
	public int searchLast(int[] x) {
		for(int i=0;i<x.length;i++) {
			if(x[i]<last)
			last = x[i];
		}
		return last;
	}
}
