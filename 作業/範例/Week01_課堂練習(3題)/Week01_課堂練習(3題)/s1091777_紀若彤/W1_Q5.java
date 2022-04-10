//璸衡タ俱计程そ计&程そ计
//戈恨A 410917774 璝
//2022/02/24
import java.util.*;
public class W1_Q5 {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(a + "," + b + "," + c + "程そ计:" + gcd(gcd(a,b),c)+" ");
        
        int s = a*b/gcd(a,b);
        
        System.out.println(a + "," + b + "," + c + "程そ计:" + s*c/gcd(s,c));
    }
    static int gcd(int a,int b){
        if(a%b==0){
            return b;
            }else{
                return gcd(b,a%b);
            }
        }
}

