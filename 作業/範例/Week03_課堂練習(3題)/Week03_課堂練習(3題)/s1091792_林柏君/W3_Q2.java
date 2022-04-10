/*
 * �Z�šG��ޤGB
 * �Ǹ��G410917928
 * �m�W�G�L�f�g
 * �D�ءGW3_Q2
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
		System.out.print("�п�Jx�G");
		int x = sc.nextInt();
		System.out.print("�п�Jy�G");
		int y = sc.nextInt();
		System.out.println();
		
		//int gcd = 1;
		//int lcm = 1;
		
		//����x����]�Ƥ��ѩ�i�}�Carrx
		System.out.print(x+"����]�Ƥ��ѵ��G�}�C���G");
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
		System.out.print(arrx);  //��X�}�C
		System.out.println();
		////
		
		
		//y����]�Ƥ��ѩ�i�}�Carry
		System.out.print(y+"����]�Ƥ��ѵ��G�}�C���G");
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
		System.out.print(arry);  //��X�}�C
		System.out.println();
		System.out.println();
		////
		
		/*
		////
		for (int i=0; i<arrx.size(); i++)
		{
			for (int j=0; j<arry.size(); j++)
			{
				if (arrx.get(i)==0 && arry.get(j)==0)  //���p���S���ƭȪ��ܡA�N���X�j��
				{
					break;
				}
				else
				{
					if (arrx.get(i)==arry.get(j))  //�p�G��Ӧ]�Ƭ۵��A�N���Wgcd�Mlcm
					{
						gcd*=arrx.get(i);
						lcm*=arrx.get(i);
						//System.out.print(j+" ");
						i++;
					}
					else if (arrx.get(i)!=arry.get(j))  //�p�G���۵�
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
		System.out.println("�̤j���]�Ƭ��G"+gcd(arrx, arry));
		System.out.println("�̤p�����Ƭ��G"+lcm(arrx, arry));
		////
		
		
		
		
		///////
	}
}