package 資料結構第二次作業;
/*最接近質數問題
 * 410981082
 * 資管二B
 * 何佳蘭
 * 2022/03/06 
 */
import java.util.Scanner;
public class W2_Q2 {

	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int large = 0; //n值向上最近的質數p
		int small = 0;//n值向下最近的質數q
		
		for(int i = n+1 ; i < 10000 ; i++) {//計算p值,i設定為找尋小於10000的質數
			int count = 0;
			
			for(int j = 2 ; j < i ; j++) {//找質數
				if(i % j == 0)
					count++;
				if(count == 0 && j == i-1) {
					large = i;
					break;
				}
			}
			
			if(large == i) //找到最近的質數就break
				break;
		}
		
		for(int i = n-1 ; i > 1 ; i--) {//計算q值,質數從2開始所以i設定為大於1
			int count = 0;
			
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0)
					count++;
				if(count == 0 && j == i-1) {
					small = i;
					break;
				}
			}
			
			if(small == i)
				break;
		}
		
		if(large-n > n-small) {
			System.out.print("最接近"+n+"的質數: " + small);
		} 
		else if(large-n < n-small) {
			System.out.print("最接近"+n+"的質數: " + large);
		} 
		else {
			System.out.print("最接近"+n+"的質數: " + small + " " + large);
		}
		
		
	}
}