import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ޤGA 410954344	�����[
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("�п�J�����n:");
		double number  =input.nextDouble();
		double remainder=0;
		double factor=0;
		
		for(int i =1;i<=number;i++)
		{
			remainder=number%i;
			if(remainder==0)
			{
				factor=factor+1;
			}
		}

		if(factor==2)
		{
			System.out.println(number+"�����");
		}
		else
		{
			System.out.println("���Ƥ������");
		}
	}

}
