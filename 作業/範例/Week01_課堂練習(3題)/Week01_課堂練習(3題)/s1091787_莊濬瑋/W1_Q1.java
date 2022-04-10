//資管2A 410917871 莊濬瑋
// 2022/02/23
//Q1: 判斷使用者輸入的正整數是否為質數
import java.util.*;
public class W1_Q1 {

	public aas() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 for(int i=2;i<a;i++) {
			if (a%i==0) {
				System.out.print(a+"不是質數");
				break;
			}
			else {
				System.out.print(a+"是質數");
				break;
			}
		 }
		 
	 
	 
	 
	 
	 }
}

