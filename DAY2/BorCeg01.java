//����1-100֮�������ĸ�����������ֻ�ܱ�1��������������������С��������2��
public class BorCeg01 {
	public static void main(String[] args) {
		int num=0;
		int m=1;
		System.out.println("1-100֮�������");
		for(int x=2;x<100;x++)
		{
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
		}
	System.out.println("�����ĸ���"+num);
	}
}

