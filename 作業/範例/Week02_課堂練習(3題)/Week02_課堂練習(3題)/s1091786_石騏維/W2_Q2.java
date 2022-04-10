//410917863 資管2B 石騏維
import java.io.*;
import java.util.Scanner; 
public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("�п�J�n���Ѫ����"); 
	        Scanner sc = new Scanner(System.in); 
	        int number = sc.nextInt();
	        int k =2; 
	        System.out.print(number + "=" ); 
	        while(number>k){ 
	            if(number%k==0){ 
	                System.out.print(k+"*"); 
	                number=number/k; 
	            }else{ 
	                k++; 
	            } 
	        } 
	        System.out.print(number); 
	}

}
