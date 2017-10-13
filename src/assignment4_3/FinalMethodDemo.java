package assignment4_3;//package name

class FinalMethod{//class with final method
	final void finalMethodExample(){//final method 
		System.out.println("calling method");
	}//end of method
}//end of class


public class FinalMethodDemo extends FinalMethod{//class extends class with final method
	
	void finalMethodExample(){//overrding final method from parent class compile error
		System.out.println("calling method2");
	}
	
	public static void main(String args[]){//main method
		FinalMethodDemo var= new FinalMethodDemo();//creating FinalMethodDemo object
		var.finalMethodExample();//calling method
	}

}
