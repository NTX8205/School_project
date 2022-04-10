package java資結;
/*判斷使用者輸入的正整數是否為質數
 * 410981082
 * 資管二B
 * 何佳蘭
 * 2022/02/23 11:47
 */
import java.util.Scanner;
public class W1_Q1 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
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
			System.out.println("此數為質數");
		}
		else
		{
			System.out.println("此數不為質數");
		}
	}

}
