package test;
import java.util.*;
public class W4_Q1 {

	public static void main(String[] args) {
		// Q1:三號出局
		// 資傳三B 410855338  黃勝彥
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三號出局遊戲的玩家人數");
		int gg=0/*死亡人數*/,count=0,n = sc.nextInt();
		int[] arr = new int[n];

		while(gg<n-1) 
		{
			for (int i=0;i<n;i++) 
			{
				if (arr[i]!=-1) 
				{
					count++;
					if (count==3) 
					{
						count=0;
						gg++;
						arr[i]=-1;
					}
				}
			}
		}

		for (int i=0;i<n;i++) 
		{
			if (arr[i]!=-1) 
			{
				System.out.println("最後留下來的是"+(i+1)+"號");
			}
		}
	}

}
