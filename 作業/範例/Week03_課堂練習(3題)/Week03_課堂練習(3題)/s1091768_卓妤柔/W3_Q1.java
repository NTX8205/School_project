/* Q1: �ƧǦ��� */
//��ޤGA 410917685 �����X

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
	    		arr[i] = rand.nextInt(100)+1;
	    		System.out.print(" "+arr[i]);
	    	}
	    	System.out.println();
	    
	    	System.out.print("�o"+n+"�Ӿ�Ʀb�Ƨǫ᪺���ަ��Ǭ�");
	    	
	    	for(int num=1; num<100; num++)
	    	{	
	    		for(int i=0; i<n; i++)
	    		{	
	    			if(arr[i] == num)
	    			{
	    				arr1[i] = big;
	    				for(int j=0; j<n; j++)
	    	    		{
	    					if(arr[j] == num)
	    					{
	    						arr1[j] = big;
	    					}
	    	    		}
	    				big++;
	    			}
	    		}
	    	}
	    
	    	for(int i=0; i<n; i++)
	    		System.out.print(" "+arr1[i]);
	    }
	}
}
