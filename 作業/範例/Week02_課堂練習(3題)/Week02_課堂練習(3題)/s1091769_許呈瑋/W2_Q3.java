//質因數分解進階
//資管二B 410917693 許呈瑋
//2022/03/04
import java.util.*;
public class W2_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		System.out.print(n +" = ");
		
		for(int i = 2;;) {
			
			if(n%i==0) {
				sum++;
				n/=i;
			}else {
				
				if(sum > 1) {
					System.out.print(i + "^"+sum);
				}else if(sum == 1) {
					System.out.print(i);
				}else if(sum == 0){
					i++;
					continue;
				}
				
				sum = 0;
				i++;
				
				if(n == 1) {
					break;
				}else {
					System.out.print("*");
				}
				
			}
		
		}
	}
}
