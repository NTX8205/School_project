//Q3: 璸衡ㄢタ俱计程そ计&程そ计
//戈恨B 410921838 狶ㄘ俯
//Date:2022/02/28
import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int g=0;
		int a=x,b=y;
		while(x % y!= 0) {
			g=y;
			y=x%y;
			x=g;
		}
		System.out.printf("%d籔%d程そ计%d%n",a,b,y);
		System.out.printf("%d籔%d程そ计%d",a,b,a*b/y);
		
	}

}
