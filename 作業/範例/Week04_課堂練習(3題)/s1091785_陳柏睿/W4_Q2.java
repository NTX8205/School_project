import java.util.*;
public class W4_Q2 
{
	public static void main(String[] args) 
	{//前段和與後段和
	//資管二A 410917855 陳柏睿
		Scanner io=new Scanner(System.in);
		int a=io.nextInt(),b[]=new int [a],forward[]=new int [a];
		for(int i=0;i<a;i++) 
			{
				int c=io.nextInt();
				b[i]+=c;
			}
		int count=0,sum1=0,sum2=0;
		for(int i=0;i<a;i++)
			{
				sum1+=b[i];
				forward[i]+=sum1;
			}
		for(int i=a-1;i>=0;i--)
			{
				sum2+=b[i];
				System.out.println("sum2:"+sum2);
			for(int j=0;j<a;j++) 
				{
				if(forward[j]==sum2) 
					{
						count++;
					}	
				}
			}
		System.out.println(count);

	}

}
