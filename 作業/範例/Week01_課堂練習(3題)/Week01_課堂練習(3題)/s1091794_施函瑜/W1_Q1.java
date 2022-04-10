//Q1: 判斷使用者輸入的正整數是否為質數
//410917944 資管二A 施函瑜
//日期:2022/2/23
import java.util.*;
public class W1_Q1 {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int n= sc.nextInt();
int count=0;
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.printf("%d是質數",n);
}
else{
System.out.printf("%d不是質數",n);
}
}
}