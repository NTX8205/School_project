import java.util.*;
public class W3_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int [] x1 = new int[10];
		int [] y1 = new int[10];
		System.out.print(x+"=");
		for(int i=2;i<=x;i++) {
			while(i!=x) {	
				if(x%i==0) {
					System.out.print(i+"*");
					x/=i;	
				}else {
					break;
				}

			}
		}
		System.out.println(x);
		System.out.print(y+"=");
		for(int i=2;i<=y;i++) {
			while(i!=y) {	
				if(y%i==0) {
					System.out.print(i+"*");
					y/=i;	
				}else {
					break;
				}

			}
		}		
		System.out.print(y);
	}

}
