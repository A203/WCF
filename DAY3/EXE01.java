import java.util.Scanner;


//************************************	
	//����һ���ӿ�Assaultable(�ɹ�����)���ýӿ���һ�����󷽷�attack()
	interface Assaultable{
		abstract void attack();
	}
	
	
	
	//����һ���ӿ�Mobile�����ƶ��ģ�,�ýӿ���һ�����󷽷�move()
	
	interface Mobile{
		abstract void move();
	}
	
	
	
	//����һ��������Weapon,ʵ��Assaultable�ӿں�Mobile�ӿڣ�����û�и��������ʵ�ַ���
	abstract class  Weapon implements Assaultable,Mobile{
		public abstract void attack();
		
		public abstract void move();
	}
	
	
	
	
//����3���ࣺTank,Flighter,WarShip���̳���Weapon,�ֱ��ò�ͬ�ķ�ʽʵ�� Weapon ���еĳ��󷽷�
	
	
	
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
	
	
	
	
	
	//дһ����Army,����һ֧���ӣ�
	//�������һ��������Weapon����w�������洢�þ�����ӵ�е�������������
	//���໹�ṩһ�����췽����
	//�ڹ��췽����ͨ����һ��int���͵Ĳ������޶���������ӵ�е������������,
	//������һ��С����ʼ������w�����໹�ṩһ������addWeapon(Weapon wa),
	//��ʾ�Ѳ���wa��������������뵽����w��
	//��������л�������������attackAll()��moveAll()��
	//��w�����е����������������ƶ���
	
	class Army{
		
		Weapon[] w;
		//���췽��
		Army(int a ){
			
			System.out.println("��ֻ��������ӵ�е������������Ϊ    "+a);
			//Weapon[] w=new Weapon[a];//{new Tank(),new Flighter(),new WarShip()};
			
		}
		
		
		//addWeapon(Weapon wa)����
		void addWeapon(Weapon wa){
		
		}
		
		//attackAll()����
		void attackAll(){
			System.out.println("All weapon attack!!!");
		}
		
		//moveAll()����
		void moveAll(){
			System.out.println("All weapon move!!!");
		}
		
	}
	
	
	
	
	//дһ��������ȥ�������ϳ���
	//public class ArmyTest {
		public class EXE01 {
	
		public static void main(String[] args) {
			System.out.println("����Ҫ��ֻ����ӵ�ж���������   ");
			Scanner scanner=new Scanner(System.in);
			int a=scanner.nextInt();
			Army army=new Army(a);
			army.attackAll();
			army.w=new Weapon[a];
			
			/*for (int i = 0; i <army.w .length; i++) {
				army.w[i]=new 
			}*/
			System.out.println("����Ҫ��������������");
			System.out.println("1.Tank\n2.Flighter\n3.WarShip");
			int s=scanner.nextInt();
			switch (s) {
			case 1:
				System.out.println("��Ҫ������������Tank \n������Ҫ�������ֲ�����\n1.����\n2.�ƶ�");
				int m=scanner.nextInt();
				switch (m) {
				case 1:
					System.out.println("ȫ�幥��");
					break;
				case 2:
					System.out.println("ȫ���ƶ�");
				default:
				break;
				}
				break;
			case 2:
				System.out.println("��Ҫ������������Flighter \n������Ҫ�������ֲ�����\n1.����\n2.�ƶ�");
				int n=scanner.nextInt();
				switch (n) {
				case 1:
					System.out.println("ȫ�幥��");
					break;
				case 2:
					System.out.println();
				default:
					break;
				}
				break;
			case 3:
				System.out.println("��Ҫ������������WarShip \n������Ҫ�������ֲ�����\n1.����\n2.�ƶ�");
				int k=scanner.nextInt();
				switch (k) {
				case 1:
					System.out.println("ȫ�幥��");
					break;
				case 2:
					System.out.println("ȫ���ƶ�");
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

