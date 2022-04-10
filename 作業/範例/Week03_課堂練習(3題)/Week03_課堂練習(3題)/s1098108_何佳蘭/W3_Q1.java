package 資料結構第三次作業;
/*排序次序
 * 410981082
 * 資管二B
 * 何佳蘭
 */
import java.util.*;
public class W3_Q1 {

	public static void main(String[] args)
	{
		System.out.println("請輸入1~10的一個數字:");
		Scanner sc1 = new Scanner(System.in);
		Random rand = new Random();
		int n = sc1.nextInt();
		
		
		for(int j = 1; j <= n; j++)
		{
			int k = rand.nextInt(100); // 0~100 以內的隨機整數
			System.out.print(k+" ");
        }
//		輸入需要排序的數位
		Scanner sc2 = new Scanner(System.in);
		for(int i = 0; i < n; i++) { // 回圈讀入需要排序的數位
			int t = sc2.nextInt();
		}
	}

}
