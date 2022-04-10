//題目說明:Q2: 最接近質數問題
//使用者輸入一個正整數n, 找出與n最接近的質數	
//班級:資管二B
//學號:410918233
//姓名:邵弘翔
import java.util.Scanner;
public class W2_Q2 {
	public static boolean ip (int n) {
		if(n%2==0) {
			return n==2;
		}else if (n>2) {
			for(int i=3;i<n;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt(),small=0,max=0;
		
		for(int i=n-1;i>1;i--) {
			if(ip(i)) {
				small=i;
				break;
			}
		}
		
		for(int i=n+1;;i++) {
			if(ip(i)) {
				max=i;
				break;
			}
		}
		
		if( (max-n) > (n-small) ) {
			System.out.printf("最接近 %d 的質數 : %d", n ,small);
		}else if ((max-n) < (n-small)) {
			System.out.printf("最接近 %d 的質數 : %d", n ,max);
		}else {
			System.out.printf("最接近 %d 的質數 : %d %d" , n ,small,max);
		}
	}

}
