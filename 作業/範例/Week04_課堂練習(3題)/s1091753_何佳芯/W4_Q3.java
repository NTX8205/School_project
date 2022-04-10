/*圓括號對應Parenthesis Matching
資管二B 410917538 何佳芯
2022/03/21
*/
import java.util.*;
public class W4_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個包含圓括號的運算式!!");
		String s=sc.next();
		Stack<Integer> list=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				list.push(i);
			}else if(s.charAt(i)==')') {
				if(list.empty()) {
					System.out.println("-1,"+i);
				}else {
					System.out.println(list.pop()+","+i);
				}
			}
			while(list.empty()) {
				System.out.println(list.pop()+",-1");
			}
		}
	}

}
