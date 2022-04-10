import java.util.*;
public class W3_Q1 
{
	public static void main(String[] args) 
	{
		//資管二A 410917855 陳柏睿
		//排序次序
		Scanner io=new Scanner(System.in);
		System.out.println("請輸入想要幾個亂數做比大小(1<=n<=10):");
		int n=io.nextInt();
		int a[]=new int[n];
		int aa[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			a[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("幫你生成的亂數如下");
		for(int i:a) 
		{
			System.out.print(i+" ");
		}	
		System.out.println();
		for(int i=0;i<n;i++) 
		{
			int sum=1;
			for(int j=0;j<n;j++) 
			{
				if(a[i]>a[j]) 
				{
					sum++;
				}
			}
			aa[i]=sum;
		}
		System.out.println("幫你比完大小了");
		arr(aa,n);
	}
	static void arr(int a[],int n) 
	{
		for(int i=0;i<n;i++)
			{
			if(i==n-1)
				{
				System.out.print(a[i]);
				break;
				}
			System.out.print(a[i]+" ");
			}
	}
}
