import java.io.*;
import java.util.*;
public class what2 {
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	int x=sc.nextInt();
	 	int y=sc.nextInt();
	  	for(int i=x;i>=0;i--){
	  		if(x%i==0 && y%i==0) {
	  			System.out.println(i);
	  			break;
	  		}
	  	}
	  	for(int j=y;j<=9999;j++) {
	  		if(j%x==0 &&j%y==0) {
	  			System.out.print(j);
  			break;
	  		}
	  	}
	  	
	}
}