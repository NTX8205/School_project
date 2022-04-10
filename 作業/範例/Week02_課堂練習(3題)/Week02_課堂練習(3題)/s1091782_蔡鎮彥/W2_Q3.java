/*Q3: 質因數分解進階版 
  資管二B 410917821 蔡鎮彥*/ 
import java.io.*;
import java.util.*;
public class Q3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0; //起始值0
		System.out.print(n+" = ");//印出n有幾個質因數
		for(int i=2;;) { //設i=2去除n
			if(n%i==0) {
				count++;
				n/=i;
			} else {
				if(count>1) {
					System.out.print(i+"^"+count);
				}else if(count==1) {
				
					System.out.print(i);
			
				}else if(count==0) {
					i++;
					continue;
				}
				count=0;
				i++;
				if(n==1) {
					break;
				} else {
					System.out.print("*");
				}
			}
		}
		
	}

}
