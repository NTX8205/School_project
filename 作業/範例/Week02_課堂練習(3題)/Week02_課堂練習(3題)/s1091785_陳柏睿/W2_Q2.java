import java.util.*;
public class W2_Q2 {
	//��ޤGA 410917855 ���f��
	//�̱����ư��D
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		System.out.println("�п�J���D�������:");
		int a=io.nextInt();
		if((a-front(a))==(back(a)-a)) 
		{
			System.out.printf("�̱���%d�����:%d %d",a,front(a),back(a));
		}
		else if((a-front(a))>(back(a)-a))
		{
			System.out.printf("�̱���%d�����:%d",a,back(a));
		}
		else if((a-front(a))<(back(a)-a))
		{
			System.out.printf("�̱���%d�����:%d",a,front(a));
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