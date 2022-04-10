//Q3: 質因數分解進階版
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2022/3/2

import java.util.*;

public class W2_Q3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        System.out.printf("%d=", n);

        for (int i = 2;i<=n; i++) {
            while (n % i == 0) {
                count += 1;
                n = n / i;
            }
            if (count >1) {
                System.out.print(i + "^" + count);
            } else if (count == 1) {
                System.out.print(i);      
            }
            
            if(n!=1 && count!=0){
                System.out.print("*");
            }
            count=0;
        }
    }
}
