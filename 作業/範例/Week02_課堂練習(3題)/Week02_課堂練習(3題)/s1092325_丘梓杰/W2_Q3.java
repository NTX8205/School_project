 
//系級:資管二B
//學號:410923254
//姓名:丘梓杰 
//題目:質因數分解進階版

package homework;
import java.util.Scanner;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int count=0;
		System.out.print(g+" = ");
		for(int i=2;;) {
			if(g%i==0) {
				count++;
				g/=i;				
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
				if(g==1) {
					break;
				}
				count=0;
				i++;
				if(g==1) {
					break;
				}
				else {
					System.out.print("*");
				}
			}
		}
	}
}
