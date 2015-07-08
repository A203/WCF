//打印1-99之间能够被5整除的所有的数
//并记录下不符合要求的数字的个数
public class Continue01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		for(int i=1;i<=99;i++)
		{
			if(i%5==0){
				System.out.println(i);
				continue;
			}
			num++;//记录个数
		}
		System.out.println("num:"+num);	

	}

}
