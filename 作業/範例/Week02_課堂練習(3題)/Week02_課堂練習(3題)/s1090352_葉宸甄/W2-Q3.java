//題目：質因數分解進階版
//班級：資管二B 學號：410903521 姓名：葉宸甄
//日期：3/02
import java.util.*;
public class Q3 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		  int count=0;
		  System.out.print(n+" = ");
		  for(int i=2;;) {
			  if(n%i==0) {
				  count++;
				  n/=1;
			  }else {
				  if(count>1) {
					  System.out.print(i+"^"+count);
				  }else if(count==1) {
					  System.out.print(i);
				  }else if(count==0) {
					  i++;
					  continue;
				  }
				  count=0;
				  i++;
				  if(n==1) {
					  break;
				  }
				  else {
					  System.out.print("*");
				  }
			  }
		  
	}
  }
}
