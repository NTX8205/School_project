import java.util.*;

public class W1_Q3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        Max_Min(a,b);
    }
    public static void Max_Min(int a,int b){
        int i = a;
        int j = b;
        int x =0,y =0;
        if(a < b){
            x = b;
            b = a;
            a = x;
        }
        while(b != 0){
            y = a % b;
            a = b;
            b = y;
        }
        //最小公倍數
        int t = i * j / a;
        System.out.println(i+"和"+j+"的最大公約數為："+ a);
        System.out.println(i+"和"+j+"的最小公倍數為："+ t);  
    }
}