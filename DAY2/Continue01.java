//��ӡ1-99֮���ܹ���5���������е���
//����¼�²�����Ҫ������ֵĸ���
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
			num++;//��¼����
		}
		System.out.println("num:"+num);	

	}

}
