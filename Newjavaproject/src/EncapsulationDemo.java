package oops;
class A2 {
	private int i;
	public int getI() {
		return this.i;
	}
	public void setI(int i) {
		this.i=i;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj =new A2();
		System.out.println(obj.getI());
		obj.setI(45);
		System.out.println(obj.getI());

	}

}
