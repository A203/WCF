import javax.crypto.spec.IvParameterSpec;


public class SHUZU02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int []b;
//		int c[5];//�����������ʱ������ָ�����鳤��
		
		//�����ڴ�ռ�
		a=new int[3];
		
		int size=5;
		b=new int[size];
		
		//�����ʼ����ʽ1
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		//��ʼ�� ��ʽ2
		int c[]={1,2,3,4,5};
		int c1[]=new int[]{1,2,3,4,5};
		//int c2[]=new int[5]{1,2,3,4,5};//��������˳�ʼ��ֵ��������ָ������
		/*int c3[];
		 * c3={1,2,3,4,5};
		 */
		
		//���a��������
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		
		//ð������
		int d[]={8,5,7,4};
		int temp=0;
		for(int i=d.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(d[i]<d[j])
				{
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}

}
