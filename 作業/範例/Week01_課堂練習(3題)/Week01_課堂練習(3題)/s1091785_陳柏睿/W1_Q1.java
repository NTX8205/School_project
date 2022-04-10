import java.util.Scanner;
	
public class W1_Q1 {
	public static void main (String args[]) {
	Scanner io=new Scanner (System.in);
	//資管二A 410917855 陳柏睿
	//判斷使用者輸入的正整數是否為質數
			int n=io.nextInt();
			int sum=1;
			for (int i =2;i<=n;i++) {
				if(n%i==0) {
					sum+=i;
				}
			}
			if(sum==n+1) {
				System.out.println(n+"是質數");
			}
			else {
				System.out.println(n+"不是質數");
			}

		}

	}