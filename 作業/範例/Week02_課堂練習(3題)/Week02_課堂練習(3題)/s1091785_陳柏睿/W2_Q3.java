import java.util.Scanner;
public class W2_Q3 {
	//��ޤGA 410917855 ���f��
	//��]�Ƥ��Ѷi����
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		System.out.println("�п�J�Q���Ѫ��j��0��:");
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
