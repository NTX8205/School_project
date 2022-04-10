//Exra1:GCD&LCM(二個正整數)迴圈的解法
//班級:資管2A 學號:410918186 姓名:吳仲彥
//日期:2022/2/23
import java.util.Scanner;
public class extra1 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Max_Min(x,y);
	}
		public static void Max_Min(int x,int y)
		{
		int i = x;
		int j = y;
		int a =0,b =0;
		if(x < y)
		{
			a = y;
			y = x;
			x = a;
		}
		while(y != 0)
		{
			b = x % y;
			x = y;
			y = b;
		}
		int t = i * j / x;
		System.out.println(i+"和"+j+"的最大公因數為"+ x);
		System.out.println(i+"和"+j+"的最小公倍數為"+ t);
		}

}