//圓括號對應 Parenthesis Matching
//410654114資工5B李明熹
//2022/3/21
import java.util.Scanner;
import java.util.Stack;

public class W4_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Integer> list = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				list.push(i);
			}else if(str.charAt(i)==')') {
				if(list.empty()) {
					System.out.print("-1"+i);
				}else {
					System.out.print(+i);
				}
			}
			while(!list.empty()) {
				System.out.print(list.pop()+",-1");
			}

		}

	}

}
