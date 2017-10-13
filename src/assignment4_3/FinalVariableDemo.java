package assignment4_3;//package name

public class FinalVariableDemo {
	
	final int countVar = 0;//declaring variable as final

	public FinalVariableDemo() {
		countVar++; //The final field FinalVariableExample.count cannot be assigned
	}
	
	public static void main(String args[]){//main method
		FinalVariableDemo varDemo = new FinalVariableDemo();//instantiating object
	}

}
