import java.util.*;
public class W1_Q3{
	//戈恨A 410917855 朝琭和
	//璸衡ㄢタ俱计程そ计&程そ计

	public static void main (String[] args) {
		Scanner io=new Scanner (System.in);
		int a=io.nextInt();
		int b=io.nextInt();
		int max=Math.max(a,b);
		int sum=a*b;
		System.out.println("GCD:"+GCD(a,b));
		for(int i=2;i<max;i++) {
			while(a!=i && b!=i) {
				if(a%i==0&&b%i==0) {
					a/=i;
					b/=i;
					sum/=i;
				}
				break;
			}
		}
		System.out.println("LCM:"+sum);
	}
	static int GCD(int a,int b) {
		int c=a%b;
		if(c==0) {
			return b;
		}
		else 
			return GCD(b,c);
		
	}
}
