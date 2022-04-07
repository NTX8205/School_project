package 作業.回家作業.W4;

/**
 * 題目:圓括號對應Parenthesis Matching
 * 班級:資管二B
 * 姓名:許哲睿
 * 學號:410928050
 * 日期:2022.03.22
 */

import java.util.*;
public class W4_Q3 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = sc.next();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> position = new ArrayList<Integer>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==40){
                str.add("(");
                position.add(i);
            }
            else if(c==41){
                str.add(")");
                position.add(i);
            }
        }

        System.out.println(str);
        System.out.println(position);

    }
}
