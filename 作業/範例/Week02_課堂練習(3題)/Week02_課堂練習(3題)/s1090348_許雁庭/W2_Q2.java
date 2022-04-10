//Q2: 最接近質數問題，使用者輸入一個正整數n, 找出與n最接近的質數
//資管二B/410903482/許雁庭

import java.util.Scanner;
public class W2_Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt() , small = 0 , large = 0;
		
		for(int i = n-1 ; i > 1 ; i--)
		{
			if(isPrimeNumber (i)) {
				small = i;
				break;
			}
		}
		
		for(int i = n+1 ; ; i++)
		{
			if(isPrimeNumber (i)) {
				large = i;
				break;
			}
		}
		
		if((large-n) > (n-small))
		{
			System.out.printf("最接近%d的質數： %d", n , small);
		}
		else if ((large-n) < (n-small))
		{
			System.out.printf("最接近%d的質數：%d", n , large);
		}
		else
		{
			System.out.printf("最接近%d的質數： %d %d", n , small , large);
		}
	}

	public static boolean isPrimeNumber (int n)
	{
		int count = 0;
		
		for(int i = 1 ; i <= n ; i++)
		{
	    	if(n%i == 0)
	        	count++;
	    }
		
	    if(count > 2)
	    	return false;
	    else
	        return true;
	}
}