//Q1: 判斷使用者輸入的正整數是否為質數
//班級:資管二B
//學號:41091817
//姓名:葉思妤
//Date:2022/02/23
import java.util.Scanner;
public class W1_Q1{
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int sum=0;
	    
	    for(int i=1;i<N;i++){
	    	if(N%i==0){
	    		sum++;
	        }   
	    }
	    
	    if(sum>2) {
			System.out.printf("%d不是質數",N);
	    }else{
	    	System.out.printf("%d是質數",N);
	    } 
	}
}