//����1-100֮�������ĸ�����������ֻ�ܱ�1��������������������С��������2��
public class WhileEg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int m=1;
		int x=2;
		System.out.println("1-100֮�������");
		while(x<=100){
			double k =x/2;
			for(int i=2;i<=k;i++)
			{
				if((x%i)==0)
				{
					m=0;
					break;
				}
			}
		
			if(m==1){
			System.out.println(x+" ");
			num++;
			}
		m=1;
		x++;
			
		}
			
		
		System.out.println("�����ĸ���"+num);
	}

}
