package hw;
import java.util.*;
public class Q1 {
	public static void main(String []args){
		Scanner sc=new Scanner( System.in);
		int num=sc.nextInt();
		System.out.print("可整除"+num+"的因數有");
		for(int i=1; i<num; i++){
			if(num%i==0)
				System.out.print(i+",");
			else
				continue;
		
		}
		System.out.print(num);
		boolean flag = true;
		// 判斷一個數是不是質數，只需判斷 2 到 num1 的平方根，減少迴圈次數
		for (int i = 2; i <= Math.sqrt(num); i++) {
			// 如果 輸入數 能被 2 ~~ 根號num1 之間的值整除，說明不是質數
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.printf("\r\n%d是質數",num);
		} else {
			System.out.printf("\r\n%d不是質數",num);
		}
	}
}

