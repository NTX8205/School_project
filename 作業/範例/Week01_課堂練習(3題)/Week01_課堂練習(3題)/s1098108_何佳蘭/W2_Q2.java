package java資結;
/*將使用者輸入的正整進行質因數分解
 * 410981082
 * 資管二B
 * 何佳蘭
 * 2022/02/24 21:27
 */
import java.util.Scanner;
public class W2_Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個整數:");
		int num=sc.nextInt();
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

