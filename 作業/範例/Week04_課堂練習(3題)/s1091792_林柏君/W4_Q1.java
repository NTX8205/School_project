/*
 * 班級：資管二B
 * 學號：410917928
 * 姓名：林柏君
 * 題目：W4_Q1 三號出局
 * 日期：2022/03/16
 */
import java.util.*;

public class W4_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入n：");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1;i<=n;i++)
		{
			sum = (sum+3)%i;
		}
				
		System.out.println("最後一個未出局者的編號為" + (sum+1));
		
	}

}
