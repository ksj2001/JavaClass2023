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
		System.out.print("나의 IPTV는 "+ip+"주소의 ");
		super.printProperty();
	}
	
	
}
