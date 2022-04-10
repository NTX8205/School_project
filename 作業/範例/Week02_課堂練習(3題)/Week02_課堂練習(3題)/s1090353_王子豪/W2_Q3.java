//Q3:質因數分解進階版
//資管二A 410903539 王子豪
import java.util.*;
public class W2_Q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int count=0;
		System.out.print(x+" = ");
		for(int i=2;;) {
			if(x%i==0) {
				count++;
				x/=i;
			}else {
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
				if(x==1) {
					break;
				}
				else {
					System.out.print("*");
				}
			}
		}
	}
}
