//作业1.定义一个20*5的二维数组，用来存储某班级20位学员的5门课的成绩；
//这5门课按存储顺序依次为：core C++，coreJava，Servlet，JSP和EJB。
//（1）循环给二维数组的每一个元素赋0~100之间的随机整数
//（2）按照列表的方式输出这些学员的每门课程的成绩。
//（3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
//（4）要求编写程序求所有学员的某门课程的平均分。
public class EXE1 {
	public static void main(String[] args) {
		int stu[][] =new int [20][5];
		int [] totalscore =new int[20];
		int [] avescore =new int[5];
		for(int i=0;i<20;i++){
		for(int j=0;j<5;j++){
		stu[i][j]=(int)Math.round((Math.random()*100));
		}
		}

		System.out.print("student Name  ");
		System.out.print("core C++ ");
		System.out.print("CoraJava ");

		System.out.print("Servlet  ");

		System.out.print("JSP      ");

		System.out.println("EJB      ");

		for(int i=0;i<20;i++){
		System.out.print("student"+i+":"+ "      ");
		for(int j=0;j<5;j++){

		System.out.print("   "+stu[i][j]+"   ");

		}
		System.out.println();

		for(int m=0;m<20;m++){
		int sum=0;
		for(int n=0;n<5;n++){
		sum=sum+stu[m][n];

		}
		totalscore[m]=sum;

		}

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int m=0;m<20;m++){
		System.out.println("student"+m +"' total score:       "+ totalscore[m]);

		}

		for(int m=0;m<5;m++){
		int sum=0;
		int ave=0;
		for(int n=0;n<20;n++){
		sum=stu[n][m]+sum;
		}
		ave=sum/20;
		avescore[m]=ave;

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Average Score:");
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Core C++: "+ avescore[0]);
		System.out.println("Core Java:"+ avescore[1]);
		System.out.println("Servlet   "+ avescore[2]);
		System.out.println("JSP:      "+ avescore[3]);
		System.out.println("EJB:      "+ avescore[4]);

	}

}
