/*
 Q1: �ƧǦ���
 ��ޤGB 410927892 �B����
 date:2022/03/14
*/
import java.util.*;
import java.io.*;
public class W3_Q1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Random rand = new Random();
	    int []arr1=new int[n];
	    int []arr2=new int[n];
	    System.out.print("�}�C�Ƨǫe�G");
	    for(int i=0;i<n;i++)
	    {
		    int a=rand.nextInt(100);// 0~100 �H�����H�����
	    	arr1[i]=a;
		    arr2[i]=arr1[i];
	    }
	    System.out.println(Arrays.toString(arr1));
	    
	    Arrays.sort(arr2);
	    System.out.print("�}�C�Ƨǫ�G");
	    System.out.println(Arrays.toString(arr2));
	    
	    System.out.print("���ަ��Ǭ��G");
	    for(int i=0;i<arr1.length;i++) 
	    {
	    	for(int j=0;j<arr2.length;j++) {
	    		if(arr1[i]==arr2[j]) {
	    			System.out.print(j+1);
	    		}
	    	}
	    }
	}
}
