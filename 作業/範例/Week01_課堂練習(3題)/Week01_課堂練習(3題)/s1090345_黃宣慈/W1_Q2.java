//Q2:將使用者輸入的正整數進行質因數分解
//班級:資管二A;姓名:黃宣慈;學號:410903458
//日期:2/24 W1_Q2;
import java.util.*;
public class W1_Q2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i=2;
	while(n>i) {
	if(n%i==0) {
	  System.out.print(i+"*");
	    n=n/i;
	}else{   
		i++;
	 }      
	}
  System.out.println(i);
  }
}

