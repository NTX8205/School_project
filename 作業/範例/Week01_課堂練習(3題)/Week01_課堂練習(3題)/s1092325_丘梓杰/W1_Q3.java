//Q3: 計算兩個正整數的最大公因數&最小公倍數
//
//姓名：丘梓杰
//班別：資管二B
//學號：410923254


//費氏數列，非遞迴解法
import java.util.Scanner;
public class W1_Q3 {
public static void main(String[] args){
System.out.println("輸入要計算的數列位置，EX: 輸入7，則計算f(7) = 1，1，2，3，5，8，13");
System.out.print("請輸入大於0的值：");
Scanner scanner = new Scanner(System.in);
int g = scanner.nextInt();
int g_1 = 1, g_2 = 1;
int tp1 = 0, tp2 = 2;

System.out.print("g(" + g + ") = ");
if(g == 1){
System.out.println(g_1);
System.out.println("加總\t：1");
}
else if(g == 2){
System.out.print(g_1 + " " + g_2);
System.out.println("加總\t：2");
}
else{
System.out.print(g_1 + " " + g_2 + " ");
for(int i = 0; i < g-2; i++){
tp1 = g_1;
g_1 = g_2;
g_2 = tp1 + g_2;
System.out.print(g_2 + " ");
tp2 += g_2;
}
System.out.println();
System.out.println("加總\t：" + tp2);
}
}
}

