//題目說明:Q1: [p,q]區間質數問題
//使用者輸入兩個正整數p, q, 找出介於p到q之間的所有質數與質數總數
//班級:資管二B
//學號:410918233
//姓名:邵弘翔
import java.util.Scanner;
public class W2_Q1 {
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
		int sum=0,a=sc.nextInt(),b=sc.nextInt();
		if(a>b) {
			int tem =a;
			a=b;
			b=tem;
		}
		
		for(int i=a;i<b;i++) {
			if(ip(i)) {
				System.out.print(i+" ");
				sum+=1;
			}
		}
		System.out.println("\n質數個數 "+sum);

	}

}
