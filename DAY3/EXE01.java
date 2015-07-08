import java.util.Scanner;


//************************************	
	//定义一个接口Assaultable(可攻击的)，该接口有一个抽象方法attack()
	interface Assaultable{
		abstract void attack();
	}
	
	
	
	//定义一个接口Mobile（可移动的）,该接口有一个抽象方法move()
	
	interface Mobile{
		abstract void move();
	}
	
	
	
	//定义一个抽象类Weapon,实现Assaultable接口和Mobile接口，但并没有给出具体的实现方法
	abstract class  Weapon implements Assaultable,Mobile{
		public abstract void attack();
		
		public abstract void move();
	}
	
	
	
	
//定义3个类：Tank,Flighter,WarShip都继承自Weapon,分别用不同的方式实现 Weapon 类中的抽象方法
	
	
	
	class Tank extends Weapon{
	
		public void attack() {
			
		System.out.println("Tank  attack!!!");
		}
	
		public void move() {
			System.out.println("Tank  move!!!");
			
		}
		
	}
	
	
	
	class Flighter extends Weapon{
	
		public void attack() {
			System.out.println("Flighter  attack!!!");
		}
	
		public void move() {
			System.out.println("Flighter  move!!!");
			
		}
		
	}
	
	
	
	
	class WarShip extends Weapon{
	
		public void attack() {
				System.out.println("WarShip  attack!!!");	
		}
	
		public void move() {
			System.out.println("WarShip   move!!!");
			
		}
		
	}
	
	
	
	
	
	//写一个类Army,代表一支军队，
	//这个类有一个属性是Weapon数组w（用来存储该军队所拥有的所有武器）；
	//该类还提供一个构造方法，
	//在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量,
	//并用这一大小来初始化数组w。该类还提供一个方法addWeapon(Weapon wa),
	//表示把参数wa所代表的武器加入到数组w中
	//在这个类中还定义两个方法attackAll()和moveAll()，
	//让w数组中的所有武器攻击和移动。
	
	class Army{
		
		Weapon[] w;
		//构造方法
		Army(int a ){
			
			System.out.println("这只军队所能拥有的最大武器数量为    "+a);
			//Weapon[] w=new Weapon[a];//{new Tank(),new Flighter(),new WarShip()};
			
		}
		
		
		//addWeapon(Weapon wa)方法
		void addWeapon(Weapon wa){
		
		}
		
		//attackAll()方法
		void attackAll(){
			System.out.println("All weapon attack!!!");
		}
		
		//moveAll()方法
		void moveAll(){
			System.out.println("All weapon move!!!");
		}
		
	}
	
	
	
	
	//写一个主方法去测试以上程序。
	//public class ArmyTest {
		public class EXE01 {
	
		public static void main(String[] args) {
			System.out.println("你想要这只军队拥有多少武器：   ");
			Scanner scanner=new Scanner(System.in);
			int a=scanner.nextInt();
			Army army=new Army(a);
			army.attackAll();
			army.w=new Weapon[a];
			
			/*for (int i = 0; i <army.w .length; i++) {
				army.w[i]=new 
			}*/
			System.out.println("你想要控制哪种武器？");
			System.out.println("1.Tank\n2.Flighter\n3.WarShip");
			int s=scanner.nextInt();
			switch (s) {
			case 1:
				System.out.println("你要操作的武器是Tank \n请问你要进行哪种操作？\n1.攻击\n2.移动");
				int m=scanner.nextInt();
				switch (m) {
				case 1:
					System.out.println("全体攻击");
					break;
				case 2:
					System.out.println("全体移动");
				default:
				break;
				}
				break;
			case 2:
				System.out.println("你要操作的武器是Flighter \n请问你要进行哪种操作？\n1.攻击\n2.移动");
				int n=scanner.nextInt();
				switch (n) {
				case 1:
					System.out.println("全体攻击");
					break;
				case 2:
					System.out.println();
				default:
					break;
				}
				break;
			case 3:
				System.out.println("你要操作的武器是WarShip \n请问你要进行哪种操作？\n1.攻击\n2.移动");
				int k=scanner.nextInt();
				switch (k) {
				case 1:
					System.out.println("全体攻击");
					break;
				case 2:
					System.out.println("全体移动");
				default:
					break;
				}
				break;
			    default:
			    	break;
			}
		}
	}
//************************************

