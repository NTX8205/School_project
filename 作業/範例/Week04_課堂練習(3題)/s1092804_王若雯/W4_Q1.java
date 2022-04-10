//W4_Q1: 三號出局
//系級:資管二A  學號:410928042  姓名:王若雯
import java.util.*;
public class W4_Q1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("有n個人圍成一圈，從第一個人開始報數，凡報到3的人出局退出圈子，問最後留下的是第幾號。\n");
        System.out.println("請輸入人數n:"); 
        
        int n=sc.nextInt();
        int[] a = new int[n]; 
        int count = 0; 
        int allCount = n; 

        while (allCount != 1) 
        { 
        	for(int i = 0; i < a.length; i++) 
        	{ 
        		if (a[i] == 0) 
        		{ 
        			count++; 
        			if (count == 3) 
        			{ 
        				count = 0; 
        				a[i] = -1; 
        				allCount--; 
        			} 
        		} 
        	} 
        }
        for (int j = 0; j < a.length; j++) 
        { 
        	if (a[j] == 0) 
        		System.out.println("留下的人是第" + (j + 1) + "號。"); 
        }  
    }
}