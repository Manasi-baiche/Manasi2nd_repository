package inheritance;
class Animal{}
class Dog extends Animal{
	
	public class InstanceofDemo{
		public static void main(String[] args) {
			Dog d=new Dog();
			System.out.println(d instanceof Animal);
			System.out.println(d instanceof Dog);
		}
	}
}


