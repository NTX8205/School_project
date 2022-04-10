package 作業.回家作業.W3;


/**
 * 題目:計算2個正整數的最大公因數&最小公倍數
 * 班級:資管二B
 * 姓名:許哲睿
 * 學號:410928050
 * 日期:2022.03.09
 */

import java.util.*;

public class W3_Q2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num_a = new ArrayList<Integer>();
        ArrayList<Integer> num_b = new ArrayList<Integer>();

        System.out.println("計算2個正整數的最大公因數&最小公倍數");
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入兩個整數:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        for(int i = 2; a!=1 ;i++){
            while(a%i==0){
                num_a.add(i);
                a/=i;
            }
        }
        for (int i = 2; b != 1; i++) {
            while (b % i == 0) {
                num_b.add(i);
                b /= i;
            }
        }
        ArrayList<Integer> num_c = new ArrayList<Integer>();
        ArrayList<Integer> num_d = new ArrayList<Integer>();
        num_c.addAll(num_a);
        num_c.addAll(num_b);
        num_c.sort(Comparator.naturalOrder());
        int gcd = 1;
        System.out.println(num_c);
        for(int i = 0; i<num_c.size();i++){
            for(int j = 0; j<num_d.size();j++){
                if(num_c.get(i)!=num_d.get(j)){
                    num_d.add(num_c.get(i));
                }
            }

            
        }
        System.out.println(num_d);
        for (Integer integer : num_d) {
            gcd*=num_d.get(integer);
        }
        System.out.println(gcd);
    }

    
}
