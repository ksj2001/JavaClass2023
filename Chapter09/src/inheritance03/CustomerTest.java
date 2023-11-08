package inheritance03;
import java.util.*;
public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerlist = new ArrayList<>();
		Customer customerLee = new Customer(10100,"�̼���",0);
		Customer customerShin = new Customer(10101,"�Ż��Ӵ�",500);
		GoldCustomer customerHong = new GoldCustomer(20010,"ȫ�浿",800);
		GoldCustomer customerYul = new GoldCustomer(20011,"������",2500);
		VipCustomer customerKim = new VipCustomer(20011,"������",8500,1234);
		
		customerlist.add(customerLee);
		customerlist.add(customerShin);
		customerlist.add(customerHong);
		customerlist.add(customerYul);
		customerlist.add(customerKim);
		
		System.out.println("======= ������ ��� =======");
		for(int i=0;i<customerlist.size();i++) {
			customerlist.get(i).showCustomerInfo();
			System.out.println();
		}
		
		System.out.println("======= ���ʽ� ����Ʈ�� ������ ��� =======");
		int price = 10000;
		for(int i=0;i<customerlist.size();i++) {
			int cost = customerlist.get(i).calcPrice(price);
			System.out.println(customerlist.get(i).getCustomerName()
					+"���� "+cost+"�� �����ϼ̽��ϴ�.");
			customerlist.get(i).showCustomerInfo();
		}
	}

}
