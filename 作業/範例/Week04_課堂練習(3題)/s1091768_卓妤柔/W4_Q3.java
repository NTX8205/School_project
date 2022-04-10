/* Q1: 圓括號對應 */
//資管二Ａ 410917685 卓妤柔

import java.util.*;
public class W4_Q3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個包含圓括號的運算子:");
		String s = sc.next();
		char[] c = s.toCharArray();
		
		for(int i=0; i<c.length; i++)		//處理相對應的括號
			if(c[i] == ')')
				for(int j=i; j>=0; j--)
					if(c[j] == '(') {
						System.out.println(j+","+i);
						c[i] = '0';
						c[j] = '0';
						break;
					}
		
		for(int i=0; i<c.length; i++)	//處理落單的括號
			if(c[i] == ')') {
				System.out.println("-1,"+i);
			}else if(c[i] == '('){
				System.out.println(i+",-1");
			}
		
	}
}
// (a+(b*c)/(d-e)+f)
// ((a+b)-c*e)+(e*(f-g)