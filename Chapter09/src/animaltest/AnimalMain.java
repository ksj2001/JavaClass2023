package animaltest;

class Animal{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}
class Human extends Animal{
	@Override // Annotation으로 메모리의 주석과 같은 역할을 해 준다.
	public void move() {
		System.out.println("사람은 두 발로 걷는다.");
	}
	public void readbook() {
		System.out.println("사람이 책을 읽는다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이는 네 발로 뛴다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리는 하늘을 난다.");
	}
	public void flying() {
		System.out.println("하늘을 날아간다.");
	}
}
public class AnimalMain {

	public static void main(String[] args) {

		AnimalMain animal01 = new AnimalMain();
		animal01.MoveAnimal(new Human());
		animal01.MoveAnimal(new Tiger());
		animal01.MoveAnimal(new Eagle());
	}
	
	public void MoveAnimal(Animal animal) {
		animal.move();
		//다운캐스팅
		if(animal instanceof Human) { // animal 인스턴스 자료형이 Human 형 이라면
			Human human = (Human)animal; // 인스턴스 animal을 Human으로 다운캐스팅 hauman.readbook();
			human.readbook();
			}
			else if(animal instanceof Tiger){
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
			}
			else if(animal instanceof Eagle){
			Eagle eagle = (Eagle)animal;
			eagle.flying();
			}
			else { System.out.println("지원되지 않는 기능입니다.");
			}
		// Human human =(Human)animal;
		// human.readbook();
	}

}
