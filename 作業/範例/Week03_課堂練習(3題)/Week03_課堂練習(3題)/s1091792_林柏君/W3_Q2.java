/*
 * 班級：資管二B
 * 學號：410917928
 * 姓名：林柏君
 * 題目：W3_Q2
 */
import java.util.*;

public class W3_Q2 
{
	////
	public static int gcd(ArrayList<Integer> A,ArrayList<Integer> B)
	 {
		Map<Integer, Integer> common = new HashMap<>();

	     A.forEach(a -> common.merge(a, 1, Integer::sum));

	     int gcd = 1;
	     
	     for (Integer b : B) {
	         if (common.merge(b, -1, Integer::sum) >= 0) {
	             gcd *= b;
	         }
	     }
	     return gcd;
	 }
	 
	 public static int lcm(ArrayList<Integer> A,ArrayList<Integer> B)
	 {
	  int sum = 1;
	  for(int i=0;i<A.size();i++)
	  {
	   sum*=A.get(i);
	   
	  }
	  for(int j=0;j<B.size();j++)
	   {
	    sum*=B.get(j);
	    
	   }
	  return sum/gcd(A,B);
	 }
	 ////
	 
	 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入x：");
		int x = sc.nextInt();
		System.out.print("請輸入y：");
		int y = sc.nextInt();
		System.out.println();
		
		//int gcd = 1;
		//int lcm = 1;
		
		//先用x的質因數分解放進陣列arrx
		System.out.print(x+"的質因數分解結果陣列為：");
		ArrayList<Integer> arrx = new ArrayList<>();
		
		for (int i=2; i<=x; i++)
		{
			while (x!=i)
			{
				if (x%i==0)
			    {
			    	arrx.add(i);
			    	x/=i;
			        }
			    	else
			    	{
			    		break;
			        }
			    }
			 }
			
		arrx.add(x);
		System.out.print(arrx);  //輸出陣列
		System.out.println();
		////
		
		
		//y的質因數分解放進陣列arry
		System.out.print(y+"的質因數分解結果陣列為：");
		ArrayList<Integer> arry = new ArrayList<>();
					
		for (int i=2; i<=y; i++)
		{
			while (y!=i)
			{
				if (y%i==0)
				{
					arry.add(i);
					y/=i;
				}
				else
				{
					break;
				}
			}
		}
						
		arry.add(y);
		System.out.print(arry);  //輸出陣列
		System.out.println();
		System.out.println();
		////
		
		/*
		////
		for (int i=0; i<arrx.size(); i++)
		{
			for (int j=0; j<arry.size(); j++)
			{
				if (arrx.get(i)==0 && arry.get(j)==0)  //假如都沒有數值的話，就跳出迴圈
				{
					break;
				}
				else
				{
					if (arrx.get(i)==arry.get(j))  //如果兩個因數相等，就乘上gcd和lcm
					{
						gcd*=arrx.get(i);
						lcm*=arrx.get(i);
						//System.out.print(j+" ");
						i++;
					}
					else if (arrx.get(i)!=arry.get(j))  //如果不相等
					{
						lcm*=arrx.get(i);
						lcm*=arry.get(j);
						i++;
						//j--;
						//System.out.print(j+" ");
					}
				}
			}
			
		}*/
		System.out.println("最大公因數為："+gcd(arrx, arry));
		System.out.println("最小公倍數為："+lcm(arrx, arry));
		////
		
		
		
		
		///////
	}
}