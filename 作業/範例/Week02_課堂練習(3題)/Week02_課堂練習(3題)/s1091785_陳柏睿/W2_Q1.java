import java.util.*;
public class W2_Q1 {
	public static void main(String[] args) {
		//��ޤGA 410917855 ���f��
		//[p,q]�϶���ư��D
		Scanner io=new Scanner(System.in);
		System.out.println("�п�J��ӥ����:");
		int a=io.nextInt();
		int b=io.nextInt();
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		int count=0;
		for(int i=min;i<max;i++)
		{
			int sum=1;
			//System.out.println("1forL"+i);
			for(int j=2;j<=i;j++) 
			{
				if(i%j==0) 
				{
					sum++;
				}
				if(sum>2)break;
				
			}
			if(sum==2) 
			{
				System.out.print(i+" ");
				count++;
			}
			
		}
		System.out.printf("%n��ƭӼ�:%d",count);
	}

}

/*for(int i=min;i<max;i++)
		{
			//System.out.println("1forL"+i);
			for(int j=2;j<=i;j++) 
			{
				if(i%j==0) 
				{
					sum++;
					//System.out.println(i+" "+"j:"+j);
				}
				
				if(sum==2) 
				{
					System.out.print(i);
					break;
				}
				
				
			}
			sum=1;
			
		}
		*/

/*while(min<max)
		{
			if(min%j==0) 
				{
				sum++;
				j++;
				continue;
			}
			else if(j>min)
				{
				if(sum==2) 
				{
					System.out.printf("%d ",min);
					count++;
					sum=1;
					j=2;
				}
				min++;
				j=2;
				sum=1;
				continue;

			}
			else 
			{
				j++;
				continue;
			}
		}
*/