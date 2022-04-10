/*讲马 410917821 Q1 */
import java.io.*;
import java.util.Scanner;
public class homework {
	
	public static void main(String[] args){  
  	Scanner sc = new Scanner(System.in);
    System.out.println("叫块タ俱计n:");
  	double number = sc.nextDouble();
  	double remainder = 0;
  	double factor = 0;
  //璸衡计计
  	for(int i = 1 ; i <= number ; i++){
  	 remainder = number % i;
   	if(remainder == 0)
   {
    factor = factor + 1;
   	}
   }
  //耞琌借计挡狦
 	 if(factor == 2 ){
   		System.out.println("计借计");
  	}else{
  	 	System.out.println("计ぃ借计");
 		 }
  
  }
}
