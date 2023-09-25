package oops;
class Bird {
	public void sing() {
		System.out.println("tweet tweet");
	}
}
class Robin extends Bird {
	public void sing(String song) {
		System.out.println("twlddledd");
	}
}

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robin b=new Robin();
		b.sing();

	}

}
