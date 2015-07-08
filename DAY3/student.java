class student {
	//属性（特征）
		String name;
		String address;
		String number;
		
		//行为（方法）
		//void 方法的返回类型
		//selfIntroduction 方法名
		void selfIntroduction(){
			System.out.println("自我介绍：");
		}
		
		public static void main(String[]args){
			//实例化一个手机
			student a = new student();
			
			
			a.name="王传发";
			a.address="安徽省合肥市";
			a.number = "2012214298";
			
			System.out.println("姓名："+a.name);
			System.out.println("地址："+a.address);
			System.out.println("学号："+a.number);
			
			
		}

}
