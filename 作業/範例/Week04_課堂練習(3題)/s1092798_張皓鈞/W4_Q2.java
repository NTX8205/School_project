//
//Q2: 前段和與後段和
//班級:資管二A/學號:410927981/姓名:張皓鈞
//
import java.util.*;
public class W4_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("輸入一個正整數a:");
		int a = sc.nextInt();
		int x = 0;
		int y = 0;
		int count = 0;
		int[] arr = new int[a];
		int[] arr1 = new int[a];
		int[] arr2 = new int[a];
		
		System.out.println("再輸入a個整數:");
		for(int i = 0; i < a; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0; j < a; j++)
		{
			x += arr[j];
			arr1[j] = x; 
		}
		
		for(int k = a-1; k >= 0; k--)
		{
			y += arr[k];
			arr2[k] = y;
		}
		
		for(int i = 0; i < a; i++)
		{
			for(int j = 0; j < a; j++)
			{
				if(arr1[i] == arr2[j])
				{
					count++;
				}
			}
		}
		System.out.printf("有 %d 組相同的",count);
	}
}
