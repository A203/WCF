//九九乘法表
public class CFKOB01 {
	public static void main(String[] args) {
		//i 代表行（第一个乘数）
		for(int i=1;i<=9;i++){
			//j代表第二个乘数
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println(" ");
		}
	}
}
