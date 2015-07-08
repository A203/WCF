//5.整型数组a和b，编程实现：将a.b中不同的数字保存到一个新德尔数组中
public class SZEXE05 {
	public static void main(String[] args) {
		int[]a={10,20,30,40,50};
		int[]b={10,20,60};
		
		int[]c=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++){
			boolean flag=true;//默认有效
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					flag=false;
					break;
				}
			}
			if(flag){
				c[index]=a[i];
				index++;
			}
		}
		
		for(int i=0;i<b.length;i++){
			boolean flag=true;//默认有效
			for(int j=0;j<a.length;j++){
				if(b[i]==a[j]){
					flag=false;
					break;
				}
			}
			if(flag){
				c[index]=b[i];
				index++;
			}
		}
		
		for(int i=0;i<index;i++){
			System.out.print(c[i]+"\t");
		}
	}

}
