//Q2 最接近質數的問題
//
//班級:資管二B
//學號:410917554
//姓名:林冠廷
//
//date:2022/3/2
import java.util.*;
public class W2_Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a1=1;
        int b1=1;
        isPrime(i);
        for(int a=1;;a++){
            if(isPrime(i+a)){
                a1=i+a;
                break;
            }
        }
        for(int b=1;;b++){
            if(isPrime(i-b)){
                b1=i-b;
                break;
            }
        }
        if((i-b1)>(a1-i)){
            System.out.println(a1);
        }else if((i-b1)<(a1-i)){
            System.out.println(b1);
        }else{
            System.out.print(b1+" "+a1);
        }
    }


    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){            
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    }
}
