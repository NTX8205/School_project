package 作業.回家作業.W5;

import java.io.*;

public class ch8_410928050 {
  public static int num = 10; // 宣告全域形變數
  public static int data[] = new int[num]; // 宣告全域形陣列

  public static void main(String[] args) {

    int choice;

    System.out.printf("隨機產生 %d 個正整數, 數值介於 1 到 %d 進行不同方法的排序!\n", num, 10 * num);
    System.out.printf("(1)使用氣泡排序\n"); // 算出資料交換的次數 (加分)
    System.out.printf("(2)使用選擇排序\n");
    System.out.printf("(3)使用插入排序\n"); // 算出資料交換的次數 (加分)
    System.out.printf("(4)使用快速排序\n");
    System.out.printf("(5)使用上述四種排序方法\n");
    System.out.printf("請輸入你的選項: ");

    // 改成使用者輸入
    choice = 1;

    // 隨機產生 num 個正整數
    randomnum();

    // 根據使用者輸入選項進行排序處理
    if (choice == 1) {
      bubble_sort();
    } else if (choice == 2) {
      selection_sort();
    } else if (choice == 3) {
      insertion_sort();
    } else if (choice == 4) {
      quick_sort();
    } else if (choice == 5) {
      bubble_sort();
      selection_sort();
      insertion_sort();
      quick_sort();
    } else {
      System.out.printf("\n輸入的選項 %d 錯誤!\n", choice);
    }
  }

  public static void randomnum() // 產生10個10-99的亂數值的副程式
  {
    for (int i = 0; i < num; i++) {
      data[i] = (int) (Math.random() * num * 10) + 1;
    }

    System.out.printf("\nunsorted: ");
    for (int i = 0; i < num; i++) {
      System.out.printf("%3d ", data[i]);
    }
  }

  public static void selection_sort() {
    // System.out.printf("\nselection_sort() 施工中\n");
    long startTime = System.currentTimeMillis();// 獲取開始時間
    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
  }

  public static void insertion_sort() {
    // System.out.printf("\ninsertion_sort() 施工中\n");
    long startTime = System.currentTimeMillis();// 獲取開始時間
    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
  }

  public static void quick_sort() {
    // System.out.printf("\nquick_sort() 施工中\n");
    long startTime = System.currentTimeMillis();// 獲取開始時間
    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
  }

  public static void bubble_sort() // 氣泡排序法進行由小到大排序
  {
    long startTime = System.currentTimeMillis(); // 獲取開始時間

    int temp = 0;
    int sdata[] = new int[num];

    for (int i = 0; i < num; i++) {
      sdata[i] = data[i];
    }

    for (int i = 0; i < num - 1; i++) {
      for (int j = 0; j < num - i - 1; j++) {
        if (data[j] > data[j + 1]) // 兩數交換
        {
          temp = sdata[j];
          sdata[j] = sdata[j + 1];
          sdata[j + 1] = temp;
        }
      }

      System.out.printf("\nround %2d: ", i + 1);
      for (int j = 0; j < num; j++) // 每一輪列印結果。
      {
        System.out.printf("%3d ", sdata[j]);
      }

    }
    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
  }
}
