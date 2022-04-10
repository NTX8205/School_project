/*蔡鎮彥 410917821 Q2 */
import java.io.*;
import java.util.Scanner; 
public class homework2 {

	public static void main(String[] args) {
		 System.out.println("請輸入要分解的整數"); 
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
