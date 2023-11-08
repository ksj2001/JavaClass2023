package animaltest;

class Animal{
	public void move() {
		System.out.println("������ �����δ�.");
	}
}
class Human extends Animal{
	@Override // Annotation���� �޸��� �ּ��� ���� ������ �� �ش�.
	public void move() {
		System.out.println("����� �� �߷� �ȴ´�.");
	}
	public void readbook() {
		System.out.println("����� å�� �д´�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̴� �� �߷� �ڴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �Ѵ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ����.");
	}
	public void flying() {
		System.out.println("�ϴ��� ���ư���.");
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
		//�ٿ�ĳ����
		if(animal instanceof Human) { // animal �ν��Ͻ� �ڷ����� Human �� �̶��
			Human human = (Human)animal; // �ν��Ͻ� animal�� Human���� �ٿ�ĳ���� hauman.readbook();
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
			else { System.out.println("�������� �ʴ� ����Դϴ�.");
			}
		// Human human =(Human)animal;
		// human.readbook();
	}

}
