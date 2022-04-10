//將使用者輸入的正整數進行質因數分解
//資管二A 410918241 陳芷柔
//日期:2022/02/26
import java.util.Scanner;
public class w2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 2;
		System.out.print(n+"=");
		
		while (a<n){
			if(n%a==0) {
				System.out.print(a+"*");
				n=n/a;
			}else {
				a++;
			}
		}
		System.out.print(a);

	}

}