package interfaceEx01;

public class Television implements Buyable{
	private String name = "텔레비전";
	private String model;
	private String maker;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Television(String model, String maker, int price) {
		this.model = model;
		this.maker = maker;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public String getMaker() {
		return maker;
	}
	
}