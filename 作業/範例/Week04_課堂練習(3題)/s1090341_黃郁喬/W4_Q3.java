
/*
題目:圓括號對應
班級:資管二A 姓名:黃郁喬 學號:410903416
 */

import java.util.*;
public class W4_Q3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入一串包含括號的字串:");
        String str = sc.next();
        Stack<Integer> list = new Stack<>();
        for(int i=0; i<str.length(); i++) {
        	if(str.charAt(i)=='(') {
        		list.push(i);
        	}else if(str.charAt(i)==')') 
        	{
	        	if(list.empty())
	        	
	        		System.out.println("-1,"+i);
	        		else
	        			System.out.println(list.pop()+","+i);
	        	}
        	}
        	while(!list.empty())
        		System.out.println(list.pop()+",-1");
        
	}
}