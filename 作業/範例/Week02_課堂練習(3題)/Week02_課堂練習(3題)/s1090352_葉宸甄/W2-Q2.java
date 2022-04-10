//題目：最接近質數問題
//班級：資管二B 學號：410903521 姓名：葉宸甄
//日期：3/02
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner (System.in);
    	isPrime iP=new isPrime();
    	int n=sc.nextInt(),small=0,large=0;
    	for(int i=n-1;i>1;i--) {
    		if(iP.isPrimeNumber(i)) {
    			small=i;
    			break;
    		}
    	}
    	for(int i=n+1; ;i++) {
    		if(iP.isPrimeNumber(i)) {
    			large=i;
    			break;
    		}
    	}
    	if((large-n)>(n-small)) {
    		System.out.printf("最接近％d的質數:%d",n,small);
    	}
    	else if((large-n)<(n-small)) {
    		System.out.printf("最接近％d的質數:%d",n,large);
    	}
    	else {
    		System.out.printf("最接近％d的質數:%d %d",n,small,large);
    	}
    }
}
