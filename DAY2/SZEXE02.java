//2.�������������飺int oldarr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//Ҫ�����������е�0��ȥ��������Ϊ0��ֵ����һ���µ����飬�����µ�����Ϊ��
//int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5};
public class SZEXE02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int[] arr2=new int[arr.length];
		int index =0;
		for (int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr2[index]=arr[i];
				index++;
			}
		}
		int[]arr3=new int[index];
		for(int i=0;i<arr3.length;i++){
			arr3[i]=arr2[i];
			System.out.print(arr3[i]+"\t");
		}
	}

}
