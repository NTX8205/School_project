/*資管二B 410917821 蔡鎮彥 W3_Q1  */
import java.util.*;
import java.util.Arrays;
import java.util.Random;
public class W3_Q1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i =0;i<n;i++) {
		int k = (int)(Math.random()*100);
		a[i] =k;
		}
		Arrays.sort(a);
		for(int i =0;i<n;i++) {
		System.out.print(a[i]+" ");
		}
	}		
}

