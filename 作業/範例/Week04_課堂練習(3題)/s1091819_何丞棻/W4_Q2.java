//Q2: �e�q�M�P��q�M
//��ޤGB 410918194 ����
import java.util.*;
public class W4_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        int pre=0, cnt=0;
        for(int i=0; i<n; i++) {
            pre += a[i];
            int suf=0;
            for(int j=n-1; j>=0; j--) {
                suf+=a[j];
                if(pre==suf) {
                    cnt++;
                }
            }
        }
        
        
        System.out.print(cnt);
    }
}
