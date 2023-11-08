package chapter_06_Prob03;

public class MovablePoint extends Point{
	private int xSpeed;
	private int ySpeed;
	
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public MovablePoint() {}
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		//super.x = x; **private ����̹Ƿ� ���� �Ұ�**
		//super.y = y; **private ����̹Ƿ� ���� �Ұ�**
		setX(x);
		setY(y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return String.format("��ǥ : ("+getX()+","+getY()+")\n�̵� �ӵ� : ("+xSpeed+","+ySpeed+")");
	}
}

