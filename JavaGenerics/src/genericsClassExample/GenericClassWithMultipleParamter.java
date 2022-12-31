package genericsClassExample;

public class GenericClassWithMultipleParamter<T, V> {
	private T s1;
	private V s2;
	private String s3; // Any random variable for use

	public GenericClassWithMultipleParamter(T s1, V s2, String s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public void printValues() {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

	public static void main(String[] args) {
	GenericClassWithMultipleParamter<String, Integer> newObj=new GenericClassWithMultipleParamter<String, Integer>("10",3,"Steve");
	newObj.printValues();
	
//	10
//	3
//	Steve
	

	}
}
