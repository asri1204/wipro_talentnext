package Inheritance;

class Fruitt {
	String name;
	String taste;
	int size;
public  void eat() {
	System.out.println("the fruit name is " + name + " and taste is " + taste);
}
}
class Apple extends Fruitt{
	public Apple() {
		name = "Apple";
		taste = "Sweet";
	}
	@Override
	public void eat() {
		System.out.println("the fruit name is " + name + " and taste is " + taste);
	}
}
	
class Orange extends Fruitt{
	public Orange() {
		name = "Orange";
		taste = "Sour";
	}
	
	@Override
	public void eat() {
		System.out.println("the fruit name is " + name + " and taste is " + taste);
		
	}
}
public class Fruit{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Fruitt fruit1 = new Apple();
	        Fruitt fruit2 = new Orange();

	        fruit1.eat();
	        fruit2.eat();

	}

	}

