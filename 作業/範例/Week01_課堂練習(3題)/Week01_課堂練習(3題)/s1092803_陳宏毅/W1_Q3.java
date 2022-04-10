//戈恨B 410928034 朝Щ驾
//璸衡ㄢタ俱计程そ计&程そ计
//2022/3/1
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int e = 0 ;
		if(num1>num2) {
	    	e=num1;
	    	num1=num2;
	    	num2=e;
	    }
		System.out.println("x="+num1+",y="+num2);
		System.out.println(num1+"㎝"+num2+"程そ计:"+an(num1,num2));
		System.out.println(num1+"㎝"+num2+"程そ计:"+num1*num2/an(num1,num2));
				
		
			     }
	static int an(int num1,int num2) {
		int sm=0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0&&num2%i==0) {
				sm=i;
			}
		}
		return sm;
	}
			     }
