//Q1: 排序次序
//資管二B/410918178/葉思妤
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class W3_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		
		System.out.printf("隨機產生的%d個正整數為 ",n);
		
		if(n <= 10)
		{
			for(int i = 0; i<n; i++)
			{
				int a = rand.nextInt(100);
				arr1[i] = a;

				System.out.print(arr1[i] +" ");
			}
			
			int[] arr2 = arr1.clone();
			Arrays.sort(arr2);
			
			System.out.printf("\n這%d個整數在排序後的索引次序為",n);
			
			for(int i = 0; i<arr1.length; i++)
			{
				for(int j = 0; j<arr2.length; j++)
				{
					if(arr1[i] == arr2[j])
						System.out.print(j+1 +" ");
				}
			}
		}
	}
}