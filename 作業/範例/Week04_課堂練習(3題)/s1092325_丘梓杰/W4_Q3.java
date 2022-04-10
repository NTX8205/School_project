//Q3: 圓括號對應Parenthesis Matching
//
//姓名：丘梓杰
//班別：資管二B
//學號：410923254

import java.util.*;
public class W4_Q3{
    public static void main(String[] args) {
    static char[] str;
	static int[] flag;

	static int f(int index, boolean e) {
		for (int i = index; i < str.length; i++) {
			if (flag[i] == 1)
				continue;

			flag[i] = 1;

			if (str[i] == '(')
				System.out.println(i + "," + f(i + 1, true));
			if (str[i] == ')')
				if (e)
					return i;
				else
					System.out.println("-1," + i);
		}

		return -1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine().toCharArray();
		flag = new int[str.length];
		f(0, false);
	}
}
}