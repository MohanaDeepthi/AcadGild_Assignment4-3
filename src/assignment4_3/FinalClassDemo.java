package assignment4_3;//package name

/*Program to show that inheritance is not possible with final class throws compilation error
 * final class is to prevent inheritance
*/

final class FinalClass{
	
}

public class FinalClassDemo extends FinalClass{//create a class to demo final keyword with class
	
	public void testMethod(){
		System.out.println("test method");
	}
	
	public static void main(String args[]){
		
		FinalClassDemo d1 = new FinalClassDemo();
		
	}

}
