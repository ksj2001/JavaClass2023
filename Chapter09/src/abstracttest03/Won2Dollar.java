package abstracttest03;
public class Won2Dollar extends Converter{

	@Override
	public double convert(double src) {
		super.ratio = 1200;
		return src/ratio;
	}

	@Override
	public String getSrcString() {		
		return "¿ø";
	}

	@Override
	public String getDestString() {
		return "´Þ·¯";
	}
}

