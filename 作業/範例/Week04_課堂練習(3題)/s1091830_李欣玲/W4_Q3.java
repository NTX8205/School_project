// Q3: 圓括號對應 Parenthesis Matching
// 410918306 資管二A 李欣玲
// 日期 2022/3/20

package DataStructure;
import java.util.*;
public class W4_Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個包含圓括號的運算式");
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++) 
			{
				if(arr[i]==')') 
					{
						for(int j=i;j>=0;j--) 
							{
								if(arr[j]=='(') 
									{
										System.out.println(j + "," + i);
										arr[i]='0';
										arr[j]='0';
										break;
									}
							}
					}
			}
		
		for(int i=0;i<arr.length;i++) 
			{
				if(arr[i]==')') 
					{
						System.out.println("-1,"+i);
					}
				else if(arr[i]=='(') 
					{
						System.out.println(i+",-1");
					}
			}
	}
}
