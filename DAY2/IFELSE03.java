import java.util.Scanner;


public class IFELSE03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();
		if(score<0||score>100)
		{
			System.out.println("�������");
		}
		else if(score>=60)
		{
			System.out.println("�ɼ��ϸ�");
		}
		else{
			System.out.println("�ɼ����ϸ�");
		}
			

	}

}
