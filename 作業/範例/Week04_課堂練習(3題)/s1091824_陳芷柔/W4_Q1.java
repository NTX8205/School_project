//三號出局
//資管二A 410918241 陳芷柔
//2022/03/21
import java.util.*;
public class main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入人數:");
        int n = sc.nextInt(); 
        int count = 0;
        List list = new ArrayList();
        for (int i = 0; i < n; i++) 
        {
            list.add(i+1);
        }
        while (list.size() > 1) 
        {
            for (int i = 0; i < list.size(); i++) 
            {
                count++;
                if (count % 3 ==0) 
                {
                    list.remove(i);
                    count = 0; 
                    i--;
                }
            }
		}
        System.out.println("留下來的是"+list.get(0)+"號");
    }
    }