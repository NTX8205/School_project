package test;
import java.util.*;

public class W3_Q1 {
	public static int SeqSearch(int[]ArraySorted,int a)
	{
		for(int i=0;i<ArraySorted.length;i++)
		{
			if(ArraySorted[i]==a)
				return i+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		/*Q1:排序次序
		使用者輸入一個正整數n, 其中n<=10. 
		利用亂數隨機產生n個介於1~100的正整數並儲存到一維陣列中
		資傳三B 410855338 黃勝彥
		*/
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("請輸入一個正整數n，n<=10");	
		int tmp,n = sc.nextInt();
		int[] Array = new int[n];
		int ArraySorted[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			int randonNum = rand.nextInt(100);
			Array[i]=randonNum;
			ArraySorted[i]=randonNum;
			System.out.print(Array[i]+" ");
		}
		
		Arrays.sort(ArraySorted);
		System.out.print("\n");
		
		for(int i=0;i<n;i++)
			System.out.print(" "+SeqSearch(ArraySorted,Array[i])+" ");	
		
	}

}
