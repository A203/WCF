//3������һ���������飬����10�����ݣ����ó��򽫴����齵�����С�
public class SZEXE03 {
	public static void main(String[] args) {
		int[] arr={70,65,91,73,42,17,69,79,13,21};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
	
		}
	}

}
