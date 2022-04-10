//Q1: 排序次序
//資管二A 410927907 黃冠維
//Date:2022/3/11
import java.util.Random;
import java.util.Scanner;
public class W3_Q1
{
	public static void main(String[] args) 
	{
		System.out.println("使用者輸入一個正整數n, 其中n<=10. 利用亂數隨機產生n個介於1~100的正整數並儲存到一維陣列中");
		System.out.print("請輸入一整數n:");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = sc.nextInt();
		double arr[] = new double[11];
		double num[] = new double[n];//紀錄索引值
		for(int i = 0; i < 10 ; i++) 
		{
			arr[i] = (int)(r.nextInt(100)+1);
			if(i >= 1)
				for(int j = i-1 ; j<i ; j++) {//判斷是否重複
					if(arr[j] == arr[i]) {
						i--;
					}
				}
		}
		System.out.print("正整數分別為: ");
		for(int i = 0; i < n ; i++) 
		{
				num[i] = (int)(r.nextInt(n)+1);//索引值由此開始記錄
                for (int j = 0; j < i; j++) 
                {
                    while (num[j] == num[i])
                    {
                        j = 0;  
                        num[i] = (int)(r.nextInt(n)+1);//判斷是否重複
                    }

                }	
                System.out.print((int)arr[(int)num[i]]+" ");//隨機產生的陣列正整數
		}
		System.out.print("\n"+"索引次序為: ");
		
		for(int i = 0 ; i<n ; i++) 
		{
			System.out.print((int)num[i]+" ");
		}

	}
}

