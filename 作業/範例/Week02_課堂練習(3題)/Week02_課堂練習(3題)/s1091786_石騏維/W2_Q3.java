//410917863 資管2b 石騏維
import java.util.*;
public class hw03 {

	public hw03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		System.out.print(n+" = ");
		for(int i=2;;) {
			if(n%i==0) {
				count++;
				n/=i;
			} else {
				if(count>1) {
					System.out.print(i+"^"+count);
				} else if(count==1) {
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
				else {
					System.out.print("*");
				}
			}
		}

	}

}
