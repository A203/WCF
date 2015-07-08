//打印1-100之间的所有质数
public class ZHISHU {
	public static void main(String[] args) {
		
		for(int num=2;num<=100;num++){
			//判断num是否为质数
			boolean flag=true;//默认num是质数
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
