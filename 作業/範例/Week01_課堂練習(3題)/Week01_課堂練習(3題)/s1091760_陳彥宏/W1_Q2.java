// 410917601 資管二A 陳彥宏
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print(a+":");
		for(int i=2;i<=a;i++) {
			while(a != i) { 
				
				if(a%2==0) {
				System.out.print(i+",");
				a = a/2;
				System.out.print(2+",");
		}	
				else if(a%3==0) {
					System.out.print(3+",");
				}
			}
		}
	
		

	}

}
