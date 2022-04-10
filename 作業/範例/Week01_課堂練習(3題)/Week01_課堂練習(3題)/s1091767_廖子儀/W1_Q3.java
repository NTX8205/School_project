import java.util.*;
public class W1_Q3 {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 System.out.println(m+"和"+n+"的最大公因數為"+mcd(m,n));
		 System.out.println(m+"和"+n+"的最小公倍數為"+lcm1(m,n));
	 }
	 public static int mcd(int m, int n){
	        while(m % n != 0){
	            int tmp = m % n;
	            m = n;
	            n = tmp;
	        }
	        return n;
	    }
	 public static int lcm1(int m, int n){
	        int m1 = m;
	        int n1 = n;
	        while(m % n != 0){
	            int tmp = m % n;
	            m = n;
	            n = tmp;
	        }
	        return m1*n1 / n;
	    }
}
