package streamEx01;

public class Transaction {
	// °Å·¡
	private final Trader trader;
	private final int year;
	private final int value;
	
	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Transaction{" +
				"trader=" + this.trader +
				", year=" + this.year +
				", value=" + this.value +
				'}';
	}
	
	
}
