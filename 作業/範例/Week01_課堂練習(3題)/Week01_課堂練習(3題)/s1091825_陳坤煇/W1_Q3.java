//戈恨B
//朝辦
//410918259

import java.util.*;
public class W1_Q3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
           int n=sc.nextInt();
           int m=sc.nextInt();
            System.out.printf("%d籔%d程そ计%d%n",n,m,GCD(n,m));
            System.out.printf("%d籔%d程そ计%d%n",n,m,lcm(n,m));
        }
    }
    static int GCD(int n,int m){
        int max=Math.max(n,m);
        int min=Math.min(m,n);
        if(max%min==0){
            return min;
        }
        else {
            return GCD(min,(max%min));
        }
    }
    static int lcm(int n,int m) {
    	int n1=n;
    	int m1=m;
    	while(m%n!=0) {
    		int tmp = m%n;
    		m = n;
    		n = tmp;
    	}
    	return m1*n1/n;
    }
}