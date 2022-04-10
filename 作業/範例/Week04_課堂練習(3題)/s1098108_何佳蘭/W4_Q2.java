package 資料結構第四次作業;
/*利用陣列來解決給定的問題
Q2: 前段和與後段和
410981082
資管二B
何佳蘭
*/

import java.util.*;
public class W4_Q2 {

	public static void main(String[] args) {
		System.out.println("求出前段和與後段和");
        System.out.print("輸入一個整數n，再輸入n個整數儲存進陣列: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int total = 0;
        
        for(int i = 0 ; i < n ; i++)
        {
            x[i] = sc.nextInt();
        }
        
        System.out.print("前段和 ");
        
        for(int i = 0 ; i < n ; i++)
        {
            total += x[i];
            System.out.print(total+" ");
        }
        
        System.out.print("\n後段和 ");
        
        total = 0;
        for(int j = n-1 ; j >= 0 ; j--)
        {
            total += x[j];
            System.out.print(total+" ");
        }
        
    }    
}

