class Fruit {
	String name;
	int price;
	String address;
	
	Fruit(){}
	Fruit(String n, int p ,String a){
		name = n;
		price = p;
		address = a;
	}

	public static void main(String[] args) {
		Fruit f = new Fruit("�㽶",3,"����");
		System.out.println(f.name+f.price+"Ԫ/�����"+f.address);
	}

}
