//找出1-99之间第一个能被5整除的数，并把它打印出来
public class Break01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=99;i++)
		{
			if(i%5==0){
				System.out.println(i);
				break;
			}
		}

	}

}
