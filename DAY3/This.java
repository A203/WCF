
public class This {
	
	public static void main(String[]args){
		Food food =new Food("�׷�",10,"�й�");
		food.introduce();
	}
}

class Food{
	String name ;
	int price ;
	String address ;
	
	public Food(){}
	public Food(String name,int price){
		this.name=name;//thisָ��ǰʵ�����󣬡��ҡ�   ���﷨�൱�ڡ��ġ�
		this.price=price;
	}
	public Food(String name,int price,String address){
		this(name,price);//thisָ��ǰʵ�����󣬡��ҡ�   ���﷨�൱�ڡ��ġ�
		this.address =address;
	}
	
	void hello(){
		System.out.println("hello����������");
	}
	
	void introduce(){
		System.out.println("name:"+this.name+"\t:"+this.price+"\taddress:"+this.address);
		this.hello();//this������ʡ��
	}
}



/*
thisָ��ǰ����
this���÷�
1.this�������ڹ��췽���ڲ�����������ͬ���ĳ�Ա�����;ֲ�����
2.this�������ڵ��ù��췽�������ٴ������ࣨ�ڹ��췽����ͨ��this���������Ĺ��췽�����������ǵ�һ�䣩
3.this�������ڵ��ó�Ա���Ժͳ�Ա����
*/