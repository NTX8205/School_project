import java.util.Scanner;
public class W2_Q1 {
	//區間質數問題
	//資管二B/410917677/廖子儀
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i, j;
		if(n<m) {
			for (i = n; i <= m; i++) {
				for (j = 2; j < i; j++) {
					if (i % j == 0)
						break;
				}
				if (j >= i)
					System.out.println(j);
			}
		}else {
			for (i = m; i <= n; i++) {
				for (j = 2; j < i; j++) {
					if (i % j == 0)
						break;
				}
				if (j >= i)
					System.out.println(j);
			}
		}
	}
}