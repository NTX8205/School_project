//Q2: 將使用者輸入的正整進行質因數分解//
//資管2B 林冠廷 410917554//
//20220223//
import java.util.*;
public class Q2{
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=2;
            while(x>1){
                while(x%i==0){
                    x=x/i;
                    System.out.print(i);
                    if(x!=1){
                        System.out.print("*");
                    } 
            }
            i++;
        }
    }
}