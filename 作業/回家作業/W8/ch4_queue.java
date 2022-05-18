package 作業.回家作業.W8;

/**
 * 題目:實作 ch4-2, 空間不能再利用的版本
 * 班級:資管二B
 * 姓名:許哲睿
 * 學號:410928050
 * 日期:2022.05.18
 */
import java.io.*;

public class ch4_queue {
    public static int NUM = 10; // 定義佇列大小
    public static char Queue[] = new char[NUM]; // 宣告及建立佇列
    public static int Rear; // 宣告佇列的尾端
    public static int Front; // 宣告佇列的前端

    public static void main(String[] args) throws IOException {
        // 輸入
        int op = 0;
        Rear = -1;
        Front = -1;
        System.out.println("實作 ch4-2(佇列), 空間不能再利用的版本");
        while (op != -1) {
            BufferedReader indata;
            indata = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("1.enqueue(加入)");
            System.out.println("2.dequeue(刪除)");
            System.out.println("3.IsFull"); // 需自訂函數
            System.out.println("4.IsEmpty"); // 需自訂函數
            System.out.println("5.顯示目前佇列的內容"); // 需改寫
            System.out.print("請輸入你的操作,結束請按-1：");

            String str = indata.readLine();
            op = Integer.parseInt(str);
            switch (op) {
                case 1:
                    System.out.print("請輸入你要加入的資料：");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String str1 = br.readLine();
                    char item = str1.charAt(0);
                    // System.out.println(item);
                    Enqueue(item); // 呼叫Enqueue副程式
                    break;
                case 2:
                    item = Dequeue(); // 呼叫Dequeue副程式
                    if (item != -1)
                        System.out.println(item + "是從佇列刪除的資料\n");
                    break;
                case 3: // 呼叫自訂函數 ---------> 記得修改
                    IsFull();
                    break;
                case 4: // 呼叫自訂函數 ---------> 記得修改
                    IsEmpty();
                    break;
                case 5:
                    PrintQueue(); // 呼叫PrintQueue副程式
                    break;
                case -1:
                    System.out.println("結束程式，程式已終止 !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("無此選項，請重新輸入");
                    break;

            }
        }
    }

    public static void Enqueue(char item) // Enqueue副程式
    {

        if (Rear == NUM - 1) {
            System.out.println("佇列是滿的!\n");
            return;
        } else
            Queue[++Rear] = item;

    }

    public static char Dequeue() // Dequeue副程式
    {
        if (Front == Rear) {
            System.out.println("\n佇列是空的!\n");
            return 'x';
        } else
            return (char) Queue[++Front];
    }

    public static void IsFull() {
        if (Rear == NUM - 1 && Front == -1) {
            System.out.println("\n佇列是滿的!\n");
            return;
        } else {
            System.out.println("\n佇列尚未滿\n");
        }
    }

    public static void IsEmpty() {
        if (Front == Rear) {
            System.out.println("\n佇列是空的!\n");
            return;
        } else {
            System.out.println("\n佇列不為空\n");
        }
    }

    // 需改寫
    // 輸出順序:從頭到尾
    public static void PrintQueue() // 列印目前佇列的內容之副程式
    {
        int i;
        for (i = Front + 1; i <= Rear; i++)
            System.out.print((char) Queue[i] + " \t");
        System.out.println();
    }
}