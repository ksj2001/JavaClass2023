package interfaceEx01;

public class Refrigerator implements Buyable{
	private String name = "≥√¿Â∞Ì";
	private String model;
	private String denggub;
	private int price;

	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void setDenggub(String denggub) {
		this.denggub = denggub;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Refrigerator(String model, String denggub, int price) {
		this.model = model;
		this.denggub = denggub;
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
		return denggub;
	}
	
}