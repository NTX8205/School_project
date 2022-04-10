import java.util.Scanner;
public class W2_Q3 {
	//資管二A 410917855 陳柏睿
	//質因數分解進階版
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		System.out.println("請輸入想分解的大於0數:");
		int a=io.nextInt();
		int count=0;
		System.out.print(a+"=");
		for(int i=2;;)
		{
			if(a%i==0)
			{
				count++;
				a/=i;
			}
			else 
			{
				if(count>1)
				{
					System.out.print(i+"^"+count);
				}
				
				else if (count==1)
				{
					System.out.print(i);
				}
				
				else
				{
					i++;
					continue;
				}
				
				if(a==1) 
				{
					break;
				}
				count=0;
				System.out.print("*");
			}
			
		}
	}

}
