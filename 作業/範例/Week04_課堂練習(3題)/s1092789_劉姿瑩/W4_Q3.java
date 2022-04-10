/*
 Q3: 圓括號對應 Parenthesis Matching
 資管二B 410927892 劉姿瑩
 date:2022/03/22
*/
import java.util.*;
public class W4_Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		String str = sc.next();
		char[] c = str.toCharArray();
		for (int i=0; i<c.length-1; i++)
		{
			if(c[i]==40) 
				list1.add(i);
        }
		for(int i=c.length-1;i>0;i--)
		{
			if(c[i]==41)
				list2.add(i);
		}
		for(int i=0; i<list1.size(); i++) 
		{
			System.out.println(list1.get(i)+","+list2.get(i));
		}
	}
}
