//��ӡ1-100֮�����������
public class ZHISHU {
	public static void main(String[] args) {
		
		for(int num=2;num<=100;num++){
			//�ж�num�Ƿ�Ϊ����
			boolean flag=true;//Ĭ��num������
			for(int i = 2 ;i<num;i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(num+"\t");
			}
		}
	}
}
