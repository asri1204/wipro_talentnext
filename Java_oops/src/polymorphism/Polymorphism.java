package polymorphism;
class Shape{
	public void draw() {
		System.out.println("drawing shape");
	}
	public void erase() {
		System.out.println("erasing shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("drawing circle");
	}
	public void erase() {
		System.out.println("erasing circle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("drawing triangle");
	}
	public void erase() {
		System.out.println("erasing triangle");
	}
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("drawing square");
	}
	public void erase() {
		System.out.println("erasing square");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj1 = new Circle();
		Shape obj2 = new Triangle();
		Shape obj3 = new Square();
		obj1.draw();
		obj2.draw();
		obj2.erase();

		obj3.draw();
		obj3.erase();

		
		

	}

}
