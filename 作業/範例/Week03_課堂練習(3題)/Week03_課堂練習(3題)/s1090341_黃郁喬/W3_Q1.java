/*
�D��:�ƧǦ���
�Z��:��ޤGA �m�W:������ �Ǹ�:410903416
 */


import java.util.*;
import java.util.Random;
public class W3_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("�п�J�@��4~6�������:");
		
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] arr = array;
		int count = 1;
		
		if(n<4 || n>6)
		{
			System.out.println("�Э��s��J�@��4~6�������!");
		}
		else
		{
			for (int i=0; i<n; i++){
				array[i] = rand.nextInt(100)+1;
				
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
		
		for(int number=0; number<100; number++) 
		{
			for(int num=0; num<n; num++) 
			{
				if(arr[num]==number) 
				{
					arr[num]=count;
					count++;
				}
			}
		}
		for(int num=0; num<n; num++) 
		{
			System.out.print(" "+arr[num]);
		}
		
	}
}
/*
import java.util.*;
public class W3_Q1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("�п�J�@�Ӥ���4~6�������:");
	    int n = sc.nextInt();
	    if(4>n || n>6) 
	    {
	    	System.out.println("��J���~");
	    }else 
	    {
	    	int[] arr = new int[n];	//�H�����ͪ�n�ӥ����
	    	int[] arr1 = arr;	//�Ƨǫ᪺���ަ���
	    	int big = 1;
	    
	    	Random rand = new Random();
	    	System.out.print("���]�H�����ͪ�"+n+"�ӥ���Ƥ��O��");
	    
	    	for(int i=0; i<n; i++) 
	    	{
	    		arr[i] = rand.nextInt(100);
	    		System.out.print(" "+arr[i]);
	    	}
	    	System.out.println();
	    
	    	System.out.print("�o"+n+"�Ӿ�Ʀb�Ƨǫ᪺���ަ��Ǭ�");
	    
	    	for(int num=0; num<100; num++)	//�Ʀr0~100
	    	{	
	    		for(int i=0; i<n; i++)
	    		{	
	    			if(arr[i]==num) 
	    			{
	    				arr1[i]=big;
	    				big++;
	    			}
	    		}
	    	}
	    
	    	for(int i=0; i<n; i++)
	    		System.out.print(" "+arr1[i]);
	    }
	}
}*/