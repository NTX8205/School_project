//璸衡ㄢタ俱计程そ计&程そ计
//戈恨A 410917774 璝
//2022/02/24
import java.util.*;
public class W1_Q3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
       
        
        System.out.println(a + "籔" + b + "程そ计:" + gcd(a,b));
        
        System.out.println(a + "籔" + b + "程そ计:" + a*b/gcd(a,b));
    }
    static int gcd(int a,int b){
        if(a%b==0){
            return b;
            }else{
                return gcd(b,a%b);
            }
        }
}