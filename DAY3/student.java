class student {
	//���ԣ�������
		String name;
		String address;
		String number;
		
		//��Ϊ��������
		//void �����ķ�������
		//selfIntroduction ������
		void selfIntroduction(){
			System.out.println("���ҽ��ܣ�");
		}
		
		public static void main(String[]args){
			//ʵ����һ���ֻ�
			student a = new student();
			
			
			a.name="������";
			a.address="����ʡ�Ϸ���";
			a.number = "2012214298";
			
			System.out.println("������"+a.name);
			System.out.println("��ַ��"+a.address);
			System.out.println("ѧ�ţ�"+a.number);
			
			
		}

}
