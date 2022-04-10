import java.io.*;
import java.util.Scanner;

// 將使用者輸入的正整進行質因數分解(7=7 12=2*2*3)
public class W1_Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i = 2;
	    
	    System.out.print(n+"=");
	    
	    while(n > i) {
	    	if(n % i == 0) {
	    		System.out.print(i+"*");
	    		n = n/i;
	    	}else
	    		i++;
	    }
	    System.out.print(i);

	}

}
