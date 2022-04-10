import java.util.*;
public class W2_Q2 {
	//資管二A 410917855 陳柏睿
	//最接近質數問題
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		System.out.println("請輸入欲求的正整數:");
		int a=io.nextInt();
		if((a-front(a))==(back(a)-a)) 
		{
			System.out.printf("最接近%d的質數:%d %d",a,front(a),back(a));
		}
		else if((a-front(a))>(back(a)-a))
		{
			System.out.printf("最接近%d的質數:%d",a,back(a));
		}
		else if((a-front(a))<(back(a)-a))
		{
			System.out.printf("最接近%d的質數:%d",a,front(a));
		}
		
	}
	public static int back(int a) {
		int ans=0;
		for(int i=a+1;;i++) 
		{
			int sum=1;
			for (int j =2;j<=i;j++)
			{
				if(i%j==0) 
				{
					sum++;
				}
			}
			if(sum==2)
			{
				ans=i;
				break;
			}
			else
				continue;
		}
		return ans;
	}
	public static int  front(int a) {
		int ans=0;
		for(int i=a-1;i>1;i--) 
		{
			int sum=1;
			for (int j =2;j<=i;j++)
			{
				if(i%j==0) 
				{
					sum++;
				}
				if(sum>2)break;
			}
			if(sum==2)
			{
				ans=i;
				break;
			}
			else
				continue;
		}
		return ans;
		
	}
}