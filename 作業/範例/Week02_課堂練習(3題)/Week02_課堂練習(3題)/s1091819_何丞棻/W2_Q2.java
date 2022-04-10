//Q2: 最接近質數問題
//資管二B 410918194 何丞棻
import java.util.*;
public class W2_Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		W2_Q1 iP =new W2_Q1();
		int n= sc.nextInt(),small=0,large=0;
		for(int i=n-1;i>1;i--){
			if(iP.isPrimeNumber(i)){
				small=i;
				break ;
			}
		}
	
		for(int i=n+1; ;i++){
			if(iP.isPrimeNumber(i)){
				large=i;
				break;
			}
		}
		if((large-n) > (n-small)){
			System.out.printf("最接近%d的質數:%d",n,small);
		}else if((large-n)<(n-small)){
			System.out.printf("最接近%d的質數:%d",n,large);
		}else {
			System.out.printf("最接近%d的質數:%d %d",n,small,large);
		}
	}
}