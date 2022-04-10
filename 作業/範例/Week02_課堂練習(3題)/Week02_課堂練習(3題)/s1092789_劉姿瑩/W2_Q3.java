/*
 Q3: 質因數分解進階版
 資管二B 410927892 劉姿瑩
 date:2022/03/04
*/
import java.util.*;
public class W2_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),count=0;
		System.out.print(n+"=");
		for(int i=2;;) {
			if(n%i==0) {
				count++;
				n=n/i;
			}else{
				if(count>1) {
					System.out.print(i+"^"+count);
				}else if(count==1) {
					System.out.print(i);
				}else if(count==0) {
					i++;
					continue;
				}
				count=0;
				i++;
				if(n==1) {
					break;
				}
				System.out.print("*");
			}
		}
	}

}
