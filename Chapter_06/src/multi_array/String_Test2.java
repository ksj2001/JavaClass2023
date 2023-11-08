package multi_array;
import java.util.*;
public class String_Test2 {
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "ab";
		String str3 = "zyxvw";
		String str4 = "abcd";
		int rs1 = str1.compareTo(str2);
		System.out.println(rs1);//2
		int rs2 = str2.compareTo(str1);
		System.out.println(rs2);//-2
		int rs3 = str1.compareTo(str3);
		System.out.println(rs3);//-25
		int rs4 = str1.compareTo(str4);
		System.out.println(rs4);//0
		
	}

}
