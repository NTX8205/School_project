package ww;
import java.util.*;
public class cc {
	public static void main (String atgs[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入一個大於5的整數:");			
		int n=sc.nextInt();
		int [] ppl=new int[n];
		int remain=n;
		int count=0;
		int out=-1;
		while(remain>1) {
			for(int i=0 ; i<n ; i++) {
				if(ppl[i]!=out) {
					count++;
					
					if(count==3) {
						count=0;
						remain--;
						ppl[i]=out;
						}	
					}
				}
			}
		for(int i=0;i<n;i++) {
			if(ppl[i] != out) {
				System.out.println(i+1);
			}
		}
	}
}
