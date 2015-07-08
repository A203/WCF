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
		Fruit f = new Fruit("香蕉",3,"海南");
		System.out.println(f.name+f.price+"元/斤，产自"+f.address);
	}

}
