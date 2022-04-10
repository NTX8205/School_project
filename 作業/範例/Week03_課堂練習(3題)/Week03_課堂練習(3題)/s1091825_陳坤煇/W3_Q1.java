//Q1: 排序次序
//資管二B 410918259 陳坤煇
import java.util.*;
public class W3_Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("輸入一個正整數");
		int n=sc.nextInt();
		int a1[]=new int [n];
		for(int i=0;i<a1.length;i++) {
			a1[i]=(int)(Math.random()*100);
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		Arrays.sort(a1);
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		

	}

}
