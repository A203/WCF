//数组练习四的第二问
public class SZEXE04i {
	public static void main(String[] args) {
		int[] arr={1,3,4,5,5,5,0,0,6,7,7,11,1,3,3,6,0,5};
		
		int[] arr2=new int[arr.length];//此数组用来存放无效数字
		int index=0;
		
		for (int i=0;i<arr.length;i++){
			boolean flag=true;//默认是有效数字
			for(int j=0;j<arr.length;j++){
				if(arr[j]==arr[i]&&i!=j){
					flag=false;
					break;
				}
			}
			if (flag) {
				arr2[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<index;i++){
			System.out.print(arr2[i]+"\t");
			
		}

	}

}
