import javax.crypto.spec.IvParameterSpec;


public class SHUZU02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int []b;
//		int c[5];//声明数组变量时，不能指定数组长度
		
		//分配内存空间
		a=new int[3];
		
		int size=5;
		b=new int[size];
		
		//数组初始化方式1
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		//初始化 方式2
		int c[]={1,2,3,4,5};
		int c1[]=new int[]{1,2,3,4,5};
		//int c2[]=new int[5]{1,2,3,4,5};//如果设置了初始化值，不能再指定长度
		/*int c3[];
		 * c3={1,2,3,4,5};
		 */
		
		//输出a数组内容
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		
		//冒泡排列
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
