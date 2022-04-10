//Q2: 最接近質數問題
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2022/3/2

import java.util.*;
public class W2_Q2{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int a1,a2;
            for(int n=1;;n++){
            if(check(a+n)){
                a1=a+n;
                break;
            }
        }
        for (int n = 1;; n++) {    
            if(check(a-n)){
                a2=a-n;
                break;
            }

        }
        if(a-a2<a1-a){
            System.out.print("最近的質數是"+a2);
        }
        else if (a-a2 >a1-a) {
            System.out.print("最近的質數是" + a1);
        }
        else if (a-a2 == a1-a) {
            System.out.print("最近的質數是" + a1 +","+ a2);
        }
    }


    public static boolean check(int n) {

        int count=0;
        for(int i=2;i<=n ;i++){
            while(n%i==0){
                count++;
                n/=i;
            }
        }
        if(count==1){                
            return true;
        }else{
            return false;
        }
    }    
}    