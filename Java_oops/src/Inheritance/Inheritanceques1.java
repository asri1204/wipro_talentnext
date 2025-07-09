package Inheritance;

	
	class Animal{
		public void eat() {
			System.out.println("Iam eating animal:");
		}
		public void sleep() {
			System.out.println("Iam getting sleep:");
		}
	}
	class Bird extends Animal{
		@Override
		public void eat() {
			System.out.println("Iam eating Bird:");
		}
		@Override
		public void sleep() {
			System.out.println("Iam getting sleep:");
		}
		public void fly() {
			System.out.println("Iam going to fly:");
		}
	}
	public class Inheritanceques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Animal obj = new Animal();
		obj.eat();
		obj.sleep();
		System.out.println();
		Bird obj2 = new Bird();
		obj2.eat();
		obj2.sleep();
		obj2.fly();
	}

}
