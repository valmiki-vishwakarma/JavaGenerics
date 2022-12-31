package genericConstructor;

public class GenericConstructor {

	
	public <T> GenericConstructor(T val) {
		System.out.println("With Generic");
		System.out.println(val);
	}
	
	//Non Generic constructor
	
	public GenericConstructor(String s) {
		System.out.println("Without Generic");
		System.out.println(s);
		
	}
	/*
	 * Overloading of below constructor is not a good approach
	 * Instead use generic as above
	 * 
	public GenericConstructor(int a) {
		System.out.println("Integer");
	}
	public GenericConstructor(String a) {
		System.out.println("String");
	}
	*/
	

}
