import java.util.Scanner;
public class W4_Q1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println("有n個人圍成一圈，順序排號（從1號編到n 號）。從第一個人開始報數（從1到3報數），凡報到3的人出局退出圈子，問最後留下的是第幾號");
		 System.out.println("輸入人數n,n>=5");
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int [] people=new int [n];
		 int remain =n; //活著的
		 int count=0;  //報數
		 int out =-1;  //出局
		 
		 while(remain>1)
		 {
			 for(int i=0;i<people.length;i++)
			 {
				 if(people[i]!=out)
				 {
					 count++;
					 if(count==3)
					 {
						 count=0;
						 remain--;
						 people[i]=out;
					 }
				 }
			 }
		 }
		 for(int i=0;i<people.length;i++)
		 {
			 if(people[i]!=out)
			 {
				 System.out.println("留下來的是:"+(i+1)+"號");
			 }
		 }
	}

}
