//三號出局
//410918102 資管二B 蔡耒易展
//2022/03/22
import java.util.Scanner;
public class W4_Q1{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] people = new int[n];
        int remain = n ; //還存活著的
        int count = 0 ;  //報數
        int out = -1 ;//出局
        
        while (remain > 1) {
            for (int i = 0; i < n; i++) {
                if (people[i] != out) {
                    count++;
                    if (count == 3) {
                        count = 0;
                        remain--;
                        people[i] = out;
                        System.out.println("出局的是" + (i + 1));
                    }
                }
            }
        }
            for(int i=0;i<n;i++)
            {
                if (people[i]!=out)
                {
                    System.out.println("留下來的是"+(i+1)+"號");
                }
            }
	}
}