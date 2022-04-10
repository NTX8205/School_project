//Q2: 將使用者輸入的正整進行質因數分解
//班級:資管二B
//學號:41091817
//姓名:葉思妤
//Date:2022/02/27
import java.util.Scanner;
public class W1_Q2{
	public static void main(String[] args){  
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    System.out.print(N+"=");
	    
	    for(int i =2;i<=N;i++) {
	    	while(N!=i) {
	    		if(N%i==0){
	    			System.out.print(i+"*");
	    			N/=i;
	    		}else{
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.print(N);
	    
	}
}
