//Q2: �N�ϥΪ̿�J������i���]�Ƥ���
//410917944 ��ޤGA �I���
//���:2022/2/23
import java.util.*;
public class W1_Q2 {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int num = sc.nextInt();
System.out.print(num + "=");
for (int i = 2; i <= num; i++) {
while (num != i) {
if (num % i == 0) {
System.out.print(i + "*");
num /= i;
} else {
break;

}
}
}
System.out.print(num);
}
}