//分辨是否為質數
//資管二A 410918241 陳芷柔
//日期:2022/02/23
import java.util.Scanner;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<n;i++){
			if(n % i == 0){
				count++;
			}
		}
		if(count==2){
			System.out.printf("%d 是質數",n);
		}
		else{
			System.out.printf("%d 不是質數",n);
		}
	}
}	