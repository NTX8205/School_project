package hw;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.printf("x=%d, y = %d\r\n",a,b);
        System.out.println(a+"籔"+b+"程そ计"+gcd(a,b)+"\n"+a+"籔"+b+"程そ计"+(a*b/gcd(a,b)));
        
	}
static int gcd(int a,int b){
	if(b==0)return a;
	else return gcd(b,a%b);
}
} 



