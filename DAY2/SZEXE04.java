//4.���������飺int[] arr={1,3,4,5,5,5,0,0,6,7,7,11,1,3,3,6,0,5};
//(1).���������ظ���ȥ�������ս��Ϊ��{1,3,4,5,0,6,7,11}
//(2).��������ֻҪ�ظ������־���Ϊ��Ч������Ч����ȥ��
//���ս����{4,11}
public class SZEXE04 {
	public static void main(String[] args) {
		int[] arr={1,3,4,5,5,5,0,0,6,7,7,11,1,3,3,6,0,5};
		int[] arr2=new int[arr.length];
		
		int index=0;
		for(int i=0;i<arr.length;i++){
			boolean flag=false;//Ĭ�ϼ���û���ҵ���ͬ����
			for(int j = 0;j<index;j++){
				if(arr2[j]==arr[i]){
					flag=true;
					break;
				}
			}
			if(!flag){
				arr2[index]=arr[i];
				index++;
			}
		}
		int[] arr3=new int[index];
		for (int i=0;i<arr3.length;i++){
			arr3[i]=arr2[i];
			System.out.print(arr3[i]+"\t");
		}
	}
}
