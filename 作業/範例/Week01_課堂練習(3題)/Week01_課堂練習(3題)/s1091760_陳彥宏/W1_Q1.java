// 410917601 資管二A 陳彥宏
import java.util.*;
public class Main {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int b = 0;
	for(int i=1;i<=n;i++) {
		
		if(n%i==0) {
			System.out.println(i);
			b=b+1;
		}
}
		if(b==2) {System.out.println(n+"是質數");}
		else {System.out.println(n+"不是質數");}
		}
}



