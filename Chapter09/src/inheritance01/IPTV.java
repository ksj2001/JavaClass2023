package inheritance01;

public class IPTV extends ColorTV {
	protected String ip;
	
	public IPTV() {}
	public IPTV(String ip, int size, int color) {
		this.ip = ip;
		super.size = size;
		super.color = color;
	}
	
	@Override
	public void printProperty() {
		System.out.println();
		System.out.print("���� IPTV�� "+ip+"�ּ��� ");
		super.printProperty();
	}
	
	
}
