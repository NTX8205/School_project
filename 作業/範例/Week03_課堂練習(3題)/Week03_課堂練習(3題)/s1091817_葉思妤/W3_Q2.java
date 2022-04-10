//Q2: �p��2�ӥ���ƪ��̤j���]��(gcd)&�̤p������(lcm)
//��ޤGB/410918178/���䧱
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class W3_Q2 {
	public static ArrayList<Integer> A(int x)
	{
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for(int i = 2; i <= x; i++)
		{
			while(x % i == 0)
			{
				x/=i;
				A.add(i);
			}
		}
		
		return A;
	}
	
	public static ArrayList<Integer> B(int y)
	{
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i = 2; i <= y; i++)
		{
			while(y % i == 0)
			{
				y/=i;
				B.add(i);
			}
		}
		
		return B;
	}
	
	public static int gcd(ArrayList<Integer> A,ArrayList<Integer> B)
	{
		Map<Integer, Integer> common = new HashMap<>();

	    A.forEach(a -> common.merge(a, 1, Integer::sum));

	    int gcd = 1;
	    
	    for (Integer b : B) 
	    {
	        if (common.merge(b, -1, Integer::sum) >= 0)
	            gcd *= b;
	    }
	    
	    return gcd;
	}
	
	public static int lcm(ArrayList<Integer> A,ArrayList<Integer> B)
	{
		int sum = 1;
		
		for(int i = 0; i<A.size(); i++)
			sum*=A.get(i);
		
		for(int j = 0; j < B.size(); j++)
			sum*=B.get(j);
		
		return sum/gcd(A,B);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+"�P"+y+"�̤j���]�Ƭ�"+gcd(A(x),B(y)));
		System.out.println(x+"�P"+y+"�̤p�����Ƭ�"+lcm(A(x),B(y)));
		
	}
}