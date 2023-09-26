package Abstractpack;

abstract class Shape
{  
  abstract void draw();
}
    class Circle1 extends Shape
    {  
      void draw()
      {
    	  System.out.println("drawing circle");
      }  
    }  

public class Testabstraction1 {

	public static void main(String[] args)
	{
		Shape s=new Circle1(); 
		s.draw();  
	}

}
