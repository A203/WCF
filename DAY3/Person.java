class Person {
	String name;
	int age;
	String address;
	
	/*
	//无参默认构造方法
	Person() {
		System.out.println("Person的默认构造方法被调用·····");
	}
	*/
	
	//有参构造方法
	Person(String n , int a , String add){
		name = n ;
		age = a ;
		address = add ;
	}
	//自我介绍
	void introduce(){
		System.out.println("大家好，我叫"+name+",今年"+age+"岁了，我来自"+address+"。");
	}

	public static void main(String[] args) {
		/*
		Person a = new Person();//实例化一个对象
		a.name="王传发";
		a.address="安徽合肥";
		a.age=23;
		*/
		Person c = new Person("小明", 12, "火星");
		c.introduce();
	}

}
//当没有构造方法时，系统会自动生成一个默认构造方法
//构造方法是一种比较特殊的方法
//没有返回类型，方法名和类同名
