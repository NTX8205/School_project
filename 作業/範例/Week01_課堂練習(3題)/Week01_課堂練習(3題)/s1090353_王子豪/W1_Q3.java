// 璸衡ㄢタ俱计程そ计&程そ计(患癹㊣)
// 戈恨A 410903539 花
// 2022/2/23
package hw;
import java.util.*; 
public class W1_Q3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();         
		int y = sc.nextInt();         
		System.out.println("程そ计:" + GCD(x, y));         
		System.out.println("程そ计:" + LCM(x, y));     
	}     
	public static int GCD(int x, int y){
		int temp;         
		while(x%y!=0){
			temp = x%y;
			x=y;             
			y=temp;
		}         
		return y;     
	}     
	public static int LCM(int x, int y){         
		return x*y/GCD(x,y);     
	} 
}