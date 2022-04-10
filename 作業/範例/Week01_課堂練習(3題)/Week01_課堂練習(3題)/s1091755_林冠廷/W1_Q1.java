//Q1: 判斷使用者輸入的正整數是否為質數//
//資管2B 林冠廷 410917554//
//20220223//
import java.util.*;
public class Q1{
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int count=0;
        
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.print(i+" ");
                count++;
            }   
        }
        if(count>=3){
            
            System.out.println("是質數");

        }else{
            
            System.out.println("不是質數");
        
        }
    }
}