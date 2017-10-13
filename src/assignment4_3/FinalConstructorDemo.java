package assignment4_3;//package name

public class FinalConstructorDemo {//class name
	
	public final FinalConstructorDemo(){//constructor with final keyword
		System.out.println("constructor");
	}
	
	public static void main(String args[]){//main method
		FinalConstructorDemo demoVar = new FinalConstructorDemo();//Instantiate objecct
	}

}
