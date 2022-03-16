package 作業.回家作業.W3;



/**
 * 題目:計算3個正整數的最大公因數&最小公倍數
 * 班級:資管二B
 * 姓名:許哲睿
 * 學號:410928050
 * 日期:2022.03.09
 */

import java.util.*;

public class W3_Q3 {
    

    public static void main(String[] args) {
        

        ArrayList<Integer> num_a = new ArrayList<Integer>();
        ArrayList<Integer> num_b = new ArrayList<Integer>();
        ArrayList<Integer> num_c = new ArrayList<Integer>();

        System.out.println("計算3個正整數的最大公因數&最小公倍數");
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入三個整數:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String s = a + "," + b + "與" + c;

        for (int i = 2; a != 1; i++) {
            int count = 0;
            num_a.add(i);
            while (a % i == 0) {
                count++;
                a /= i;
            }
            num_a.add(count);
        }

        for (int i = 2; b != 1; i++) {
            int count = 0;
            num_b.add(i);
            while (b % i == 0) {
                count++;
                b /= i;
            }
            num_b.add(count);
        }

        for (int i = 2; c != 1; i++) {
            int count = 0;
            num_c.add(i);
            while (c % i == 0) {
                count++;
                c /= i;
            }
            num_c.add(count);
        }

        int gcd = 1;
        int lcm = 1;

        // 檢測用
        System.out.println(num_a);
        System.out.println(num_b);
        System.out.println(num_c);

        int gcd_size = Math.min(Math.min(num_a.size(), num_b.size()),num_c.size());

        int lcm_size = Math.max(Math.max(num_a.size(), num_b.size()),num_c.size());

        // System.out.println(gcd_size);
        // System.out.println(lcm_size);
        // System.out.println(num_a.size());
        // System.out.println(num_b.size());
        // System.out.println(num_c.size());

        for (int i = 1; i < gcd_size; i += 2) {
            if (num_a.get(i - 1) == num_b.get(i - 1) && num_b.get(i - 1) == num_c.get(i - 1) && num_a.get(i) >= 1 && num_b.get(i) >= 1 && num_c.get(i) >= 1) {
                gcd *= num_a.get(i - 1);
            }
        }

        if (num_a.size() != lcm_size) {
            int start = num_a.get(num_a.size()-2);
            int step =1;
            for (int i = num_a.size() ; i < lcm_size; i++) {
                if(step ==1){
                    start++;
                    step =2;
                    num_a.add(start);
                }
                else{
                    step =1;
                    num_a.add(0);
                }
                
            }

        } 
        if (num_b.size() != lcm_size) {
            int start = num_b.get(num_b.size() - 2);
            int step = 1;
            for (int i = num_b.size(); i < lcm_size; i++) {
                if (step == 1) { 
                    start++;
                    step = 2;
                    num_b.add(start);
                } else {
                    step = 1;
                    num_b.add(0);
                }
            }
        }
        if (num_c.size() != lcm_size) {
            int start = num_c.get(num_c.size() - 2);
            int step = 1;
            for (int i = num_c.size(); i < lcm_size; i++) {
                if (step == 1) {
                    start++;
                    step = 2;
                    num_c.add(start);
                } else {
                    step = 1;
                    num_c.add(0);
                }
            }
        }

        for (int i = 1; i < lcm_size; i += 2) {
            if (num_a.get(i - 1) == num_b.get(i - 1) && num_b.get(i - 1) == num_c.get(i - 1) && num_a.get(i) >= 1 || num_b.get(i) >= 1 || num_c.get(i) >= 1) {
                int counter = Math.max(Math.max(num_a.get(i), num_b.get(i)),num_c.get(i));

                for (int j = 1; j <= counter; j++) {
                    lcm *= num_a.get(i - 1);
                }

            }

        }

        // 檢測用
        System.out.println(num_a);
        System.out.println(num_b);
        System.out.println(num_c);

        System.out.println(s + "的最大公因數為" + gcd);
        System.out.println(s + "的最小公倍數為" + lcm);
    }

    public static int findDivisor(int n,ArrayList<Integer> divisor){
        for (int i = 2; n != 1; i++) {
            int count = 0;
            divisor.add(i);
            while (n % i == 0) {
                count++;
                n /= i;
            }
            divisor.add(count);
        }
        return n;
    }
}



class number{

    int num;

    ArrayList<Integer> divisor = new ArrayList<Integer>();

    public number(int n ,  ArrayList<Integer> divisor){
        this.num = n;
        this.divisor=divisor;
    }

    public static void findDivisor(){

    }

}