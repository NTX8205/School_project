//Q3: �p���ӥ���ƪ��̤j���]��&�̤p������
//410917944 ��ޤGA �I���
//���:2022/2/23
import java.util.*;
public class W1_Q3 {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
Max_Min(a,b);
}
public static void Max_Min(int a,int b){
int i = a;
int j = b;
int x =0,y =0;
if(a < b){
x = b;
b = a;
a = x;
}
while(b != 0){
y = a % b;
a = b;
b = y;
}
int t = i * j / a;
System.out.println(i+"�M"+j+"���̤j���]�Ƭ��G"+ a);
System.out.println(i+"�M"+j+"���̤p�����Ƭ��G"+ t);
}

}