package 作業.範例.選單;

/* ========================================================================= */
/* =========                                                   ============= */
/* =========           使用者選單 (user menu) 範例一           ============= */
/* =========                   可執行多次                      ============= */
/* =========                                                   ============= */
/* =========               使用 switch ... case                ============= */
/* =========                                                   ============= */
/* =========           Last updated: May 11, 2022              ============= */
/* ========================================================================= */

import java.util.Scanner;

public class menu_repeated2 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			// 輸出使用者選單
			System.out.printf("\n\n(1)選項一");
			System.out.printf("\n(2)選項二");
			System.out.printf("\n(3)選項三");
			System.out.printf("\n請輸入你的選擇(結束請按-1): ");

			choice = sc.nextInt();

			switch (choice) {
				case -1:
					System.out.printf("\n程式即將結束!");
					break;
				case 1:
					System.out.printf("\n執行 選項一 對應的函式");
					break;
				case 2:
					System.out.printf("\n執行 選項二 對應的函式");
					break;
				case 3:
					System.out.printf("\n執行 選項三 對應的函式");
					break;
				default:
					System.out.printf("\n你的輸入值 %d 不在範圍中", choice);
			}
		} while (choice != -1);
	}
}
