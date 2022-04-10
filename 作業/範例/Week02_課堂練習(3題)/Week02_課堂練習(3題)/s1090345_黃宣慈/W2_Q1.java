//Q1: [p,q]區間質數問題
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:3/4 W2_Q1;
import java.util.*;
public class W2_Q1 {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  int p = sc.nextInt();
	  int q = sc.nextInt();
	  int count=0;

	  if(p>q) {
		  int tmp=p;
		  p=q;
		  q=tmp;
	  }
	  for(int i=p+1; i<= q; i++) {
		  int j=2;
	   for(; j<=(int)Math.sqrt(i);j++) {
		  if(i%j==0) {
			  break;    
		  }
	
	  }if(j==(int)Math.sqrt(i)+1) {
	   System.out.print(i+" ");
	   count++; 
	}
	  }
	  System.out.println();
      System.out.println("質數個數："+count);
}
}


