//Q3: 圓括號對應 Parenthesis Matching
//班級:資管2A 學號:410918186 姓名:吳仲彥
//日期:2022/3/20
import java.util.*;
public class W4_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] a = new char [s.length()];
		boolean b = false, e=false;
		int c=-1, d=-1;
		for(int i=0; i<s.length(); i++) 
		{
			a[i]=s.charAt(i);
			
		}
		for(int i=0; i<s.length(); i++) 
		{
			if(a[i]=='(') 
			{
				c=i;
				e=true;
			}
			if(a[i]==')') 
			{
				d=i;
				b = true;
			}
			if (b && e) 
			{
				System.out.printf("%d, %d%n", c, d);
				i=-1;
				a[c]=' ';
				a[d]=' ';
				b = false;
				e = false;
				c=-1; 
				d=-1;
			}
			
		}
		if(c!=-1 || d!=-1) 
		{
			System.out.printf("%d, %d%n", c, d);
		}
	}
}
