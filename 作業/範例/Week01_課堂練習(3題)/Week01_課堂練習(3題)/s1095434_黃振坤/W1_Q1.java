import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//資管二A 410954344	黃振坤
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("請輸入正整數n:");
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
			System.out.println(number+"為質數");
		}
		else
		{
			System.out.println("此數不為質數");
		}
	}

}
