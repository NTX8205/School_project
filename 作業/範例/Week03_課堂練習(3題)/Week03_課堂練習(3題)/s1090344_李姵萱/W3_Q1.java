/*Q1: [p,q]區間質數問題*/
//資管二B 410903440 李姵萱

import java.util.Arrays; //可以使用Array提供的sort方法
import java.util.Scanner;

public class W3_Q1 {
	public static void main(String args[]) 
	{
		
		try {
			System.out.println("請輸入要產生之的數字個數:");
			Scanner scanner = new Scanner(System.in);
			int size = Integer.parseInt(scanner.nextLine());
			int n[] = new int[size];
       
			for (int i = 0; i < size; i++) 
			{
				n[i] = (int) (Math.random() * 10) + 1;
			}
      
			System.out.print("\n排序前:" + Arrays.toString(n));
			Arrays.sort(n);
			System.out.print("\n排序後:" + Arrays.toString(n));
		
		} catch (Exception e) {
			System.out.println("輸入錯誤");
		}

	}

}
