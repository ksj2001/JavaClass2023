package chapter_07_Prob05;

public class TV extends Controller{
	
	public TV(boolean power) {
		super.power = power;
	}
	
	@Override
	public String getName() {
		return "TV";
	}
}