//肈ヘ弧:璸衡ㄢタ俱计程そ计㎝程そ计
//410917651 戈恨2B 朝稢が
//Date:2022/3/1
import java.util.Scanner;
public class W1_Q3 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			int m,n,temp=1,r=1;
			int a=0;
			int b=0;
			Scanner sc=new Scanner(System.in);		
			m=sc.nextInt();
			n=sc.nextInt();
			b=m*n;
			if(n>m)
			{
			
			temp=m;
			m=n;
			n=temp;
			}
			
			try
			{
			r=m%n;
			while(r!=0)
			{
		
			m=n;
			n=r;
			r=m%n;
			}
			a=n;
			b/=a;
			System.out.printf("程そ计%d\n程そ计%d\n",a,b);
			}
			catch(ArithmeticException e)
			{
			if(a==0||b==0)
			{
			System.out.printf("程そ计%d\n程そ计%d",1,b);
			}
			}				
		}

	}


