//Q2:最接近質數問題
//資管二B/410918178/葉思妤
import java.util.*;
public class W2_Q2 
{
	public static boolean isPrime(int n) 
	{
		boolean flag = true;
		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
				flag = false;
		}
		return flag;
	}
	
	public static int nextPrime(int n) 
	{
		n++;
	    for (int i = 2; i < n; i++) 
	    {
	    	if(n % i == 0) 
	    	{
	            n++;
	            i = 2;
	        }
	    	else 
	            continue;
	    }
	    return n;
	}
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p1 = 1;
        int p2 = nextPrime(n);

        for(int i = 2; i < n; i++)
        {
        	if(isPrime(i))
        		p1 = i;
        }
        if((n-p1) == (p2-n))
        	System.out.print("最接近"+ n +"的質數:"+ p1 +" "+ p2);
        else if((n-p1) < (p2-n))
        	System.out.print("最接近"+ n +"的質數:"+ p1);
        else
        	System.out.print("最接近"+ n +"的質數:"+ p2);      
    }
}