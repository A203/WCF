
public class Exerc03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b=0;
		short s=0;
		int i=0;
		long l=1;
		float f=0;
		double d=0;
//		float f1=0.1;		//������ʧ����
		float f1=0.1f;//��ȷ
//		i=1;				//������ʧ����
//		int j=0.5*10;//������ʧ����
		double j=0.5*10;
//		byte k=b+0;		//������ʧ����
		
/*		������������Ϊ������int��;
 * 		��С��������Ϊ˫���ȣ�double����
 * 		��byte��short�Ϳ���ֱ������������ֵ��
 */
	
		byte k=(byte)(b+12);	//ǿ������ת��
//		byte k=(byte)(b+200);	//Խ�磬���н��Ϊ-56
		System.out.println(k);
	}

}
