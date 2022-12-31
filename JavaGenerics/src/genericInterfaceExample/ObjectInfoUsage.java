package genericInterfaceExample;

public class ObjectInfoUsage implements ObjectInfo<Integer>{

	
	@Override
	public Integer getObjectInfo(Integer val) {
		return val;
	}

	public static void main(String[] args) {
		ObjectInfoUsage o1=new ObjectInfoUsage();
		Integer val=o1.getObjectInfo(10000000);
		System.out.println(val);
		
	}
	
}
