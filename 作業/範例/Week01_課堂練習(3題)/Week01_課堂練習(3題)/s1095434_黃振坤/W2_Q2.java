import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ޤGA 410954344	�����[
		Scanner scanner=new Scanner(System.in);
		System.out.println("�п�J�@�Ӿ��:");
		int num=scanner.nextInt();
		System.out.print(num + "=");
		for(int k=2;k<=num;k++)
		{
			while (num!=k) 
			{
				if(num % k==0)
				{
					System.out.print(k+"*");
					num/=k;
				}
				else
				{
					break;
				}
			}
		}
		System.out.print(num);

	}

}
