package 作業.回家作業.W5;

/**
 * 題目:排序演算法實作
 * 班級:資管二B
 * 學號:410928050
 * 姓名:許哲睿
 * 日期:2022.04.12
 */

import java.io.*;
import java.util.*;

public class ch8_410928050 {
  //public static int num = 10; // 宣告全域形變數
  public static int data[] = new int[]{10,100,1000,10000,10000}; // 宣告全域形陣列
  static int process = 0;
  public static void main(String[] args) {

    int choice;
    Scanner sc =new Scanner(System.in);

    System.out.printf("排序方法實做，輸入數字決定排序方法\n");
    System.out.printf("(1)使用氣泡排序\n"); // 算出資料交換的次數 (加分)
    System.out.printf("(2)使用選擇排序\n");
    System.out.printf("(3)使用插入排序\n"); // 算出資料交換的次數 (加分)
    System.out.printf("(4)使用快速排序\n");
    System.out.printf("(5)使用上述四種排序方法\n");
    System.out.printf("請輸入你的選項: ");

    // 改成使用者輸入
    choice = sc.nextInt();

    // 隨機產生 num 個正整數
    // randomnum();

    // 根據使用者輸入選項進行排序處理
    if (choice == 1) {
      bubble_sort();
    } else if (choice == 2) {
      selection_sort();
    } else if (choice == 3) {
      insertion_sort();
    } else if (choice == 4) {
      quick_sort(data, data.length, 0, data.length - 1);
    } else if (choice == 5) {
      
      bubble_sort();
      selection_sort();
      insertion_sort();
      quick_sort(data, data.length, 0, data.length - 1);
    } else {
      System.out.printf("\n輸入的選項 %d 錯誤!\n", choice);
    }
  }

  // public static void randomnum() // 產生10個10-99的亂數值的副程式
  // {
  //   for (int i = 0; i < num; i++) {
  //     data[i] = (int) (Math.random() * num * 10) + 1;
  //   }

  //   System.out.printf("\nunsorted: ");
  //   for (int i = 0; i < num; i++) {
  //     System.out.printf("%3d ", data[i]);
  //   }
  // }

  public static void show(){
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println();
  }

  public static void selection_sort() {
    // System.out.printf("\nselection_sort() 施工中\n");
    long startTime = System.currentTimeMillis();// 獲取開始時間

    for (int i = 0; i < 4; i++) {
      for (int j = i + 1; j < 5; j++) {
        if (data[i] > data[j]) {
          int temp = data[i];
          data[i] = data[j];
          data[j] = temp;
        }
      }
      System.out.print("第" + (i + 1) + "次排序結果:");
      for (int k = 0; k < 5; k++) {
        System.out.print(data[k] + " ");
      }
      System.out.println();
    }
    System.out.println();

    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\nselection_sort 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
  }

  public static void insertion_sort() {
    // System.out.printf("\ninsertion_sort() 施工中\n");
    long startTime = System.currentTimeMillis();// 獲取開始時間

    for (int i = 0; i < data.length; i++) {

      int temp = data[i];
      int j = i - 1;
      while (j >= 0 && temp < data[j]) {
        data[j + 1] = data[j];
        j--;

      }
      System.out.print("第" + i + "次掃描:");
      show();
    }

    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\ninsertion_sort 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
  }

  public static void quick_sort(int d[], int size, int lf, int rg) {
    // System.out.printf("\nquick_sort() 施工中\n");
    long startTime = System.currentTimeMillis();// 獲取開始時間

    int temp;
    int lf_idx;
    int rg_idx;

    if (lf < rg) { 
      lf_idx = lf + 1;
      rg_idx = rg;

      // 排序
      while (true) {

        System.out.print("[處理過程" + (process++) + "]=>");
        for (int t = 0; t < size; t++) {
          System.out.print("[" + d[t] + "]");
        }
        System.out.println();

        for (int i = lf + 1; i <= rg; i++) { 
          if (d[i] >= d[lf]) {
            lf_idx = i;
            break;
          }
          lf_idx++;
        }

        for (int j = rg; j >= lf + 1; j--) { 
          if (d[j] <= d[lf]) {
            rg_idx = j;
            break;
          }
          rg_idx--;
        }

        if (lf_idx < rg_idx) { 

          temp = d[lf_idx];
          d[lf_idx] = d[rg_idx]; 
          d[rg_idx] = temp; 
        } else {
          break; 
        }
      }

      // 整理
      if (lf_idx >= rg_idx) { 

        temp = d[lf];
        d[lf] = d[rg_idx];
        d[rg_idx] = temp;

        quick_sort(d, size, lf, rg_idx - 1); 
        quick_sort(d, size, rg_idx + 1, rg); 
      }

    }

    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\nquick_sort 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
  }

  public static void bubble_sort() // 氣泡排序法進行由小到大排序
  {
    long startTime = System.currentTimeMillis(); // 獲取開始時間

    int temp = 0;
    int sdata[] = new int[data.length];

    for (int i = 0; i < data.length; i++) {
      sdata[i] = data[i];
    }

    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j] > data[j + 1]) // 兩數交換
        {
          temp = sdata[j];
          sdata[j] = sdata[j + 1];
          sdata[j + 1] = temp;
        }
      }

      System.out.printf("\nround %2d: ", i + 1);
      for (int j = 0; j < data.length; j++) // 每一輪列印結果。
      {
        System.out.printf("%3d ", sdata[j]);
      }

    }
    long endTime = System.currentTimeMillis(); // 獲取結束時間
    System.out.printf("\nbubble sort 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
  }
}
