//分辨質數
//資管二A 410921862 郭孟玥
//Date：2022/02/23
import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int k = 0;
		    for(int i=1;i<=n;i++){
		    	if(n%i==0){
		        	k++;
		    	}
		    }
		    	if(k==2){
		        	System.out.printf("%d 是質數",n);
		        }
				else{
		            System.out.printf("%d 不是質數",n );
		  		}
	}
}