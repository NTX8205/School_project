import java.io.*;
import java.util.Scanner;

//�P�_�ϥΪ̿�J������ƬO�_�����
public class W1_Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int count = 0;
	    for(int i = 1; i < n; i++)
	    {
	    	if(n % i == 0)
	        	count++;
	    }
	  
	    if(count == 1)
	    	System.out.println(n+"�O���");
	    else
	    	System.out.println(n+"���O���");

	}

}