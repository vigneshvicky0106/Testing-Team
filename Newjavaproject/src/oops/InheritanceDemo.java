package oops;
class Animals
{
	void printA()
	{
		System.out.println("animal is running");
	}
}
class Dogs extends Animals {
	void printD()
	{
		System.out.println("Dog is barking");
	}
}
class Cat extends Animals {
	void printC()
	{
		System.out.println("cat says  meow");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat L=new Cat();
		Dogs D=new Dogs();
		
		D.printD();
		D.printA();
		L.printC();
		L.printA();
				
	}

}
