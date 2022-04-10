//
//QQ1: 三號出局
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W4_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個正整數:");
		
		int a = sc.nextInt();
		int tis = a;
		int count = 0;
		int[] arr = new int[a];
		
		while(tis > 1)
		{
			for(int i = 0; i < a; i++)
			{
				if(arr[i] == 0)
				{
					count++;	
					if(count == 3)
					{
						arr[i]++;
						tis--;
						count = 0;
					}
				}
			}
		}
	
		for(int i = 0; i < a; i++)
		{
			if(arr[i] == 0)
			{
				System.out.println("最後一個未出局者的編號"+(i+1));
			}
		}
	}
}


