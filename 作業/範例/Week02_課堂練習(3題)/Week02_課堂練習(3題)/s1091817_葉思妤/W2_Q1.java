//Q1:[p,q]區間質數問題
//資管二B/410918178/葉思妤
import java.util.*;
public class W2_Q1 
{
	public static boolean isPrime(int n) 
	{
        if (n == 0 || n == 1) 
            return false;
        if (n == 2) 
            return true;
        for (int i = 2; i * i <= n; i++) 
        {
            if (n % i == 0) 
                return false;
        }
        return true;
 
    }
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    int sum = 0;
	    while(p > q) 
	    {
	    	int tmp = p;
	    	p = q;
	    	q = tmp;
	    }
	    for (int i = p; i <= q; i++) 
	    	{
		    	if (isPrime(i)) 
		    	{
		            System.out.print(i + " ");
		            sum++;
		        }
		    }
	    System.out.print("\n質數個數:"+ sum);
	}
}