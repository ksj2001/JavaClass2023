package inheritance03;
import java.util.*;
public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerlist = new ArrayList<>();
		Customer customerLee = new Customer(10100,"이순신",0);
		Customer customerShin = new Customer(10101,"신사임당",500);
		GoldCustomer customerHong = new GoldCustomer(20010,"홍길동",800);
		GoldCustomer customerYul = new GoldCustomer(20011,"이율곡",2500);
		VipCustomer customerKim = new VipCustomer(20011,"김유신",8500,1234);
		
		customerlist.add(customerLee);
		customerlist.add(customerShin);
		customerlist.add(customerHong);
		customerlist.add(customerYul);
		customerlist.add(customerKim);
		
		System.out.println("======= 고객정보 출력 =======");
		for(int i=0;i<customerlist.size();i++) {
			customerlist.get(i).showCustomerInfo();
			System.out.println();
		}
		
		System.out.println("======= 보너스 포인트와 할인율 결과 =======");
		int price = 10000;
		for(int i=0;i<customerlist.size();i++) {
			int cost = customerlist.get(i).calcPrice(price);
			System.out.println(customerlist.get(i).getCustomerName()
					+"님이 "+cost+"를 지불하셨습니다.");
			customerlist.get(i).showCustomerInfo();
		}
	}

}
