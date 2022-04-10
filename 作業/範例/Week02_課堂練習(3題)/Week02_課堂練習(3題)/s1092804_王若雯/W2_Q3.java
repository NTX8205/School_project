//Q3: 質因數分解進階版
//
//系級:資管二A
//學號:410928042
//姓名:王若雯
import java.util.*;
public class W2_Q3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int count = 0;
		
		System.out.print(n+"=");
		for(int i=2;;) {
			if(n%i==0) {  //質因數分解
				count++;
				n/=i;
			}else {
				if(count>1) {
					System.out.print(i+"^"+count);  //次方數
				}else if(count == 1){
					System.out.print(i); //一次方單獨拉出來
				}else if(count == 0) {  // ?
					i++;
					continue;
				}
				count=0;
				i++;
				if(n==1) {
					break;
				}else {
					System.out.print("*");
				}
			}
		}
	}
}