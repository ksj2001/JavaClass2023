package fruit;

public class FruitTest{

	public static void main(String[] args) {
		Box<Fruit> fruit = new Box<>();
		Box<Apple> apple = new Box<>();
		Box<Grape> grape = new Box<>();
		
	//	Box app = new Grape();
		
		fruit.add(new Fruit());
		fruit.add(new Apple());
		fruit.add(new Grape());
		System.out.println(fruit);
		apple.add(new Apple());
		apple.add(new Apple());
		System.out.println(apple);
		grape.add(new Grape());
		System.out.println(grape);
	}

}
