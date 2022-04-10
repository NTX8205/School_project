// Q2: 璸衡2タ俱计程そ计(gcd)&程そ计(lcm)
// 410917716 戈恨A 朝珇А
// ら戳 2022/3/14
package hw;
import java.util.*;
public class W3_Q2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList();
		ArrayList<Integer> arr1=new ArrayList();
		int n=sc.nextInt(),m=sc.nextInt();
		 System.out.printf("x=%d, y = %d\r\n",n,m);
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				arr.add(i);
			}
		}
		System.out.printf("[");
		for(int i=0;i<arr.size();i++){
			System.out.printf(","+arr.get(i));
		}
		System.out.printf("]\n");
		for(int i=1;i<=m;i++) {
			if(m%i==0) {
				arr1.add(i);
			}
		}
		System.out.printf("[");
		for(int j=0;j<arr1.size();j++){
			System.out.printf(","+arr1.get(j));
		}
		System.out.printf("]\n");
	        System.out.println(n+"籔"+m+"程そ计"+gcd(n,m)+"\n"+n+"籔"+m+"程そ计"+(n*m/gcd(n,m)));
	        
		}
	static int gcd(int a,int b){
		if(b==0)return a;
		else return gcd(b,a%b);
	}
}


