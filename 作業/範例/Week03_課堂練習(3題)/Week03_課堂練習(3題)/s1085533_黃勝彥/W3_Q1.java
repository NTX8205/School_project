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
		/*Q1:�ƧǦ���
		�ϥΪ̿�J�@�ӥ����n, �䤤n<=10. 
		�Q�ζü��H������n�Ӥ���1~100������ƨ��x�s��@���}�C��
		��ǤTB 410855338 ���ӫ�
		*/
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("�п�J�@�ӥ����n�An<=10");	
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
