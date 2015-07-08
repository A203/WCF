
public class wcf001 {
	public static void main(String[] args){
		System.out.println("基本类型：byte二进制位数"+Byte.SIZE);
		System.out.println("基本类型：byte最大值"+Byte.MAX_VALUE);
		System.out.println("基本类型：byte最小值"+Byte.MIN_VALUE);
		System.out.println("基本类型：float二进制位数"+Float.SIZE);
		System.out.println("基本类型：float最大位"+Float.MAX_VALUE);
		System.out.println("基本类型：float最小位"+Float.MIN_VALUE);
		System.out.println("基本类型：double二进制位数"+Double.SIZE);
		System.out.println("基本类型：double最大位"+Double.MAX_VALUE);
		System.out.println("基本类型：double最小位"+Double.MIN_VALUE);
		
		//byte类型数据赋值
		byte b=50; 
		//byte b1=130;//超出byte类型标示的数据范围
		//float变量赋值
		float f=10.0f;
		
		double d=20.0;
		
		//char类型数据赋值
		char ch1='A';
		char ch2=65;
		System.out.println(ch1+""+ch2);
		
		char ch3='中';
		
	}
}