import java.util.Scanner;
import java.util.Stack;
//圓括號對應 Parenthesis Matching
//資管二B 410921812 余汶芯 
public class W4_Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		Stack<Integer> list = new Stack<>();
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '(') {//若讀取到左括號
				list.push(i);
			} else if (n.charAt(i) == ')') {//若讀取到右括號
				if (list.empty()) {//如果沒有對應到的左括號
					System.out.printf("-1", +i);
				} else {
					System.out.println(list.pop() + "," + i);
				}
			}
		}
		while (!list.empty()) {//當沒有對應到到的右括號
			System.out.println(list.pop() + ",-1");
		}
	}
}
