//W2_Q1[p,q]區間質數問題
//
//班級:資管二B
//學號:410917554
//姓名:林冠廷
//
//date:2022/3/2
import java.util.*;
public class W2_Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int c=0;
        int count=0;
        int count2=0;
        
        if(q>p){
           
            c=p;
            p=q;
            q=c;
        
        }
        for(int i=q;i<=p;i++){
            for(int j=1;j<=i;j++){               
                if(i%j==0){
                count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
                count2++;
            }
            count=0;
        }
        System.out.println();
        System.out.println(count2+"個質數");
    }
}