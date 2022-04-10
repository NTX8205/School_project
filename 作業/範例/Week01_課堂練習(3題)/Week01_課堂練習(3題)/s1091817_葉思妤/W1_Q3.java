//Q3: 璸衡ㄢタ俱计程そ计&程そ计
//痁:戈恨B
//厩腹:41091817
//﹎:腑П
//Date:2022/02/27
import java.util.Scanner;
public class W1_Q3 {
	public static void main(String[] args) {  
	    int x=18,y=30;
	    System.out.println(x+"籔"+y+"程そ计"+GCD(x,y));
	    System.out.println(x+"籔"+y+"程そ计"+LCM(x,y));
	}
	
	static int GCD(int x,int y) {
		int z;
		z=x%y;
		
		if(z==0) {
			return y;
		}else {
			return GCD(y,z);
		}
	}
	
	static int LCM(int x,int y) {
		return x*y/GCD(x,y);
	}
}
