
public class This {
	
	public static void main(String[]args){
		Food food =new Food("米饭",10,"中国");
		food.introduce();
	}
}

class Food{
	String name ;
	int price ;
	String address ;
	
	public Food(){}
	public Food(String name,int price){
		this.name=name;//this指当前实例对象，“我”   点语法相当于“的”
		this.price=price;
	}
	public Food(String name,int price,String address){
		this(name,price);//this指当前实例对象，“我”   点语法相当于“的”
		this.address =address;
	}
	
	void hello(){
		System.out.println("hello·····");
	}
	
	void introduce(){
		System.out.println("name:"+this.name+"\t:"+this.price+"\taddress:"+this.address);
		this.hello();//this，可以省略
	}
}



/*
this指当前对象
this的用法
1.this可以用在构造方法内部，用来区分同名的成员变量和局部变量
2.this可以用于调用构造方法，减少代码冗余（在构造方法中通过this调用其他的构造方法的语句必须是第一句）
3.this可以用于调用成员属性和成员方法
*/