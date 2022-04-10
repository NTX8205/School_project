package hw;
import java.util.*;
public class plus1 {		  
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		    int a = sc.nextInt(), b = sc.nextInt(), gcd = 1;

		    for(int i = 1; i <= a && i <= b; ++i) {
		      if(a % i == 0 && b % i == 0)
		        gcd = i;
		    }

		    int lcm = (a * b) / gcd;
		    System.out.println(a+"籔"+b+"程そ计"+lcm);
		    System.out.println(a+"籔"+b+"程そ计"+gcd);
		  }
		}