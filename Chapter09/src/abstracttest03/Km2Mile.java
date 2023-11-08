package abstracttest03;
public class Km2Mile extends Converter{

	@Override
	public double convert(double src) {
		super.ratio = 1.6;
		return src/ratio;
	}

	@Override
	public String getSrcString() {		
		return "KM";
	}

	@Override
	public String getDestString() {
		return "Mile";
	}
}