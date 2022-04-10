//Q3: 圓括號對應 Parenthesis Matching
//班級:資管2A 學號:410917944 姓名:施函瑜
//日期:2022/3/20
import java.util.*;
public class W4_3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] a = new char [s.length()];
		boolean x = false;
		boolean y = false;
		int c=-1, d=-1;
		for(int i=0; i<s.length(); i++) 
		{
			a[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++) 
		{
			if(a[i]=='(') 
			{
				c=i;
				y=true;
			}
			if(a[i]==')') 
			{
				d=i;
				x = true;
			}
			if (x && y) 
			{
				System.out.printf("%d, %d%n", c, d);
				i=-1;
				a[c]=' ';
				a[d]=' ';
				x = false;
				y = false;
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
