package oops;
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	public void run() {
		System.out.println("honda bike is running");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h=new Honda();
		h.run();

	}

}
