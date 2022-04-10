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

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 2; a != 1; i++) {
            while (a % i == 0) {
                num_a.add(i);
                a /= i;
            }
        }
        for (int i = 2; b != 1; i++) {
            while (b % i == 0) {
                num_b.add(i);
                b /= i;
            }
        }

        for (int i = 0; i < num_a.size(); i++) {
            System.out.println(num_a.get(i));
        }
        for (int i = 0; i < num_b.size(); i++) {
            System.out.println(num_b.get(i));
        }
    }
}
