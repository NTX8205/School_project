//
//Q3: 質因數分解進階版
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入一個數字:");
		
		int a = sc.nextInt();
		int count = 0;
		
		System.out.print(a+"=");
		
		for(int i=2;;) {
			if(a%i==0) {
				count++;
				a=a/i;
			}else {
				if(a!=1) {
					if(count==0) {
						
					}else {
						System.out.print(i+"^"+count+"*");
					}
				}else {
					if(count!=1) {
						System.out.print(i+"^"+count);
					}else {
						System.out.print(i);
					}
					break;
				}

				i++;
				count=0;
			}
		}
	}
}
