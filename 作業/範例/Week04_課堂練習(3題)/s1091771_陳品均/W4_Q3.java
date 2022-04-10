// Q3: 圓括號對應 Parenthesis Matching
// 410917716 資管二A 陳品均
// 日期 2022/3/14
package hw;
import java.util.*;
public class W4_Q3 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		Stack<Integer> list=new Stack<>();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='(') {
				list.push(i);
			}else if(a.charAt(i)==')') {
				if(list.empty())
					System.out.println("-1,"+i);
				else
					System.out.println(list.pop()+","+i);
			}
		}
		while(!list.empty())
			System.out.println(list.pop()+",-1");
	}
}
