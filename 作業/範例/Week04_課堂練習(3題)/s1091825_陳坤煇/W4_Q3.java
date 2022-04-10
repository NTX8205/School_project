//Q3: 圓括號對應 Parenthesis Matching
//資管二B 410918259 陳坤煇

import java.io.*;
import java.util.*;;
public class W4_Q3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s =sc.next();
		int count=-1;
		ArrayList<Integer> con = new ArrayList<Integer>();
		int [] n =new int [s.length()];
		for(int i=0;i<s.length();i++)
		{
			n[i]=(int)s.charAt(i);
			if(n[i]==40) 
			{
				con.add(i);
				count++;
			}
			if(n[i]==41) 
			{
				System.out.printf("%d,%d\n",con.get(count),i);
				con.remove(count);
				count--;
			}
		}
		if(con.size()>=1)
		{
			System.out.printf("%d,%d\n",con.get(0),-1);
		}
	}
}
