// 璸衡ㄢタ俱计程そ计&程そ计 獶患癹矪瞶(癹伴)
// 戈恨A 410903539 花
// 2022/2/23
package hw;
import java.util.*; 
public class extra 
{  
	public static void main(String args[])
	{
		int x;
		int y;
		Scanner sc = new Scanner(System.in); 
		System.out.println("叫块ㄢタ俱计:"); 
		x = sc.nextInt(); 
		y = sc.nextInt(); 
		int total;
		int r; 
		total=x*y; 
			do
			{ 
				if(x<y)
				{ 
					int t=x; 
					x=y; 
					y=t; 
				}
			r=x%y; 
			x=y; 
			y=r; 
			}
		while(r!=0); 
		System.out.println("程そ计琌"+x); 
		System.out.println("程そ计琌"+total/x); 
	} 
}