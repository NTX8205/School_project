import java.util.Scanner;
import java.util.Stack;
//��A������ Parenthesis Matching
//��ޤGB 410921812 �E�Z�� 
public class W4_Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		Stack<Integer> list = new Stack<>();
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '(') {//�YŪ���쥪�A��
				list.push(i);
			} else if (n.charAt(i) == ')') {//�YŪ����k�A��
				if (list.empty()) {//�p�G�S�������쪺���A��
					System.out.printf("-1", +i);
				} else {
					System.out.println(list.pop() + "," + i);
				}
			}
		}
		while (!list.empty()) {//��S��������쪺�k�A��
			System.out.println(list.pop() + ",-1");
		}
	}
}
