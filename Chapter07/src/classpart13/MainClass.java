package classpart13;

public class MainClass {

	public static void main(String[] args) {
		Product pr = new Product();
		pr.name = "���ڱ�";
		pr.price = 1000;
		//�迭
		Product [] arr = new Product[3];
		arr[0] = new Product();
		arr[1] = new Product();
		arr[2] = new Product();
		arr[0].name = "�̸���";
		arr[1].name = "�̿���";
		arr[2].name = "��ö��";
		arr[0].price = 10;
		arr[1].price = 20;
		arr[2].price = 30;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].name+" : "+arr[i].price);
		}
		System.out.println();
	}

}
