// Q1: 三號出局
// 410918306 資管二A 李欣玲
// 日期 2022/3/20

package DataStructure;
import java.util.*;
public class W4_Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1;i<=n;i++) 
			{
				arr.add(i);
			}
		
		while(arr.size()!=1) 
			{
				arr.add(arr.remove(0));
				arr.add(arr.remove(0));
				arr.remove(0);
			}
		
		System.out.print(arr.get(0));
	}

}
