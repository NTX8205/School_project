package test;
import java.util.*;
public class W4_Q2 {
	public static void main(String[] args) {
		// Q2:�e�q�M�P��q�M
		// ��ǤTB 410855338   ���ӫ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�п�J�@�Ӿ�ơA����Ƭ��A�N��諸��Ƽ�");
		int n = sc.nextInt(),PrefixSum=0,SuffixSum=0,count=0;
		int [] arr1 = new int [n];
		int [] arr2 = new int [n];
		int [] arr3 = new int [n];
		System.out.printf("�п�J%d����Ƹ��\n",n);
		
		for(int i=0;i<n;i++)
		{
			int a = sc.nextInt();
			arr1[i]=a;
		}
		
		for(int i=0;i<arr1.length;i++) 
		{
			if(i>=1)
				arr2[i]=arr1[i]+arr2[i-1];
			else 
				arr2[i]=arr1[i];		
		}
		System.out.println("�e�q�M "+Arrays.toString(arr2));
		
		for(int j=arr1.length-1;j>=0;j--) 
		{
			if(j==arr1.length-1)
				arr3[SuffixSum]=arr1[j];
			else 
				arr3[SuffixSum]=arr1[j]+arr3[SuffixSum-1];
			SuffixSum++;
		}
		System.out.println("��q�M "+Arrays.toString(arr3));
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr3[j])
					count++;
			}
		}
		System.out.printf("�@%d��",count);

	}

}
