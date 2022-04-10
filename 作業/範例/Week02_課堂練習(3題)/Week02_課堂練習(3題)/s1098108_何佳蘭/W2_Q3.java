package 資料結構第二次作業;
/*質因數分解進階版
 * 410981082
 * 資管二B
 * 何佳蘭
 * 2022/03/06 
 */
import java.util.Scanner;
public class W2_Q3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count=0;
		System.out.print(n+"=");
		for(int i=2;;) {
			if(n%i==0) {
				count++;
				n/=i;
			}else {
				if(count>1) {
					System.out.println(i+"^"+count);
				}else if(count==1) {
					System.out.println(+i);
				}else if(count<1) {	
					i++;
					continue;
					
				}
				count=0;
				i++;
				if(n==1) {
					break;
				}
			}
		}
	}
}
