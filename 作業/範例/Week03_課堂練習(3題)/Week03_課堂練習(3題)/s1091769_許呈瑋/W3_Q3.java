//3タ俱计程そ计&程そ计
//戈恨B 410917693 砛蕹
//2022/03/14
import java.util.ArrayList;
import java.util.*;
public class W3_Q3 {

	public static void main(String[] args) {
		System.out.print("叫块タ俱计");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(), i=2, gcd=1, lcm=1;
		int x=a,y=b,z=c;
		ArrayList<Integer> A = new ArrayList();
		ArrayList<Integer> B = new ArrayList();
		ArrayList<Integer> C = new ArrayList();
		while(a != 1) {
			if(a%i==0) {
				A.add(i);
				a/=i;
			}else {
				i++;
			}
		}
		i=2;
		while(b != 1) {
			if(b%i==0) {
				B.add(i);
				b/=i;
			}else {
				i++;
			}
		}	
		i=2;
		while(c != 1) {
			if(c%i==0) {
				C.add(i);
				c/=i;
			}else {
				i++;
			}
		}
		for(int j=0;j<A.size();j++) {
			for(int k=0;k<B.size();k++) {
				for(int l=0;l<C.size();l++) {
					if(A.get(j)==B.get(k)&&A.get(j)==B.get(j)) {
					gcd*=A.get(j);
					A.set(j,1);
					break;
					}
				}
				
			}
		}
		lcm=x*y*z/gcd;	
		System.out.println(x+"籔"+y+"籔"+z+"程そ计"+gcd);
		System.out.println(x+"籔"+y+"籔"+z+"程そ计"+lcm);
		
	}

}