public class Static {
	
		 int age ;
		 void hello(){
			 System.out.println("helllo������������");
		 }
		 static String name="����";
		 
		 //��̬������Ҳ��֮Ϊ�෽��
		 static void hi(){
			 System.out.println("hi������������");
		 }
		 
		 public static void main(String[] args) {
			 Static d = new Static();
		 /*
		 //�����ǵ������Ժͷ�����ʱ��һ���ǵ���ĳ��ʵ����������Ի򷽷�
		 d.age=10;
		 d.hello();
		 */
		 System.out.println(Static.name);
		 Static.hi();
//  	 d.hi();
		 }

}
