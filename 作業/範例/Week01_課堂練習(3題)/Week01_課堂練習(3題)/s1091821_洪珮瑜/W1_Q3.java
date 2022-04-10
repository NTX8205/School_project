//璸衡ㄢタ俱计程そ计&程そ计
//戈恨B 410918217 瑇痋缝
//Date: 2022/02/27

import java.util.*;
public class W1_Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int s=0;
		int x1=x, y1=y;
		
		while(x%y != 0) {
			s = y;
			y = x%y;
			x = s;
		}
		
		System.out.printf("%d籔%d程そ计%d%n",x1,y1,y);
		System.out.printf("%d籔%d程そ计%d",x1,y1,x1*y1/y);
	}
}
