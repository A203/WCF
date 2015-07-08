import java.awt.image.SinglePixelPackedSampleModel;
//1.定义一个整型数组，求出数元素的和、数组元素的最大值和最小值，并输出所求的结果
public class SZEXE01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={21,13,91,23,72,78,88};
		int sum=0;
		int max=arr[0];
		int min=arr[0];
		
		for (int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			if(arr[i]>max){
				max=arr[i];
				continue;
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("sum:"+sum);
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
