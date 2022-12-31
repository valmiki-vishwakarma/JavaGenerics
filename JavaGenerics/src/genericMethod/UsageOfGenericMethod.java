package genericMethod;

public class UsageOfGenericMethod {

	public static void main(String[] args) {
		/*Utilities u =new Utilities();
		int a=u.getInt(100);
		System.out.println(a);
		
		double d=u.getDouble(1023.23823);
		System.out.println(d);
		
		String name=u.getString("steve");
		System.out.println(name); */
		
		Utilities u =new Utilities();
		String str=u.getVal("String");
		System.out.println(str);
		
		Float f=u.getVal(10223.383f);
		System.out.println(f);
		
		boolean flag=u.getVal(true);
		System.out.println(flag);
	}
}
