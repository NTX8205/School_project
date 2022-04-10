//Q1:三號出局
//資管二A 410903539 王子豪 
package hw2222;
import java.util.*;
public class W4_Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        List list = new ArrayList();
        for (int i=0;i<x;i++)
        {
            list.add(i+1);
        }
        while (list.size() > 1)
        {
            for(int i=0;i<list.size();i++)
            {
                count++;             
                if (count % 3 ==0) {               	
                    list.remove(i);
                    count = 0;
                    i--;
                }
            }          
        }
System.out.println(list.get(0));
    }
}