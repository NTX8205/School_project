import java.util.Scanner;

public class W4_Q2 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(); //輸入的總人數 5
	int [] arr=new int [n]; //建立一個與總人數相同位置格數的陣列
	
	for(int i=0;i<n;i++) { //將每個人數分別放入陣列中
		arr[i]=i+1; // 1|2|3|4|5(陣列中每格儲存的數字)
	}
	int j=0; //用來計算跑了n次後，要重跑一次
	int a=1; //用來計算總共跑過的次有效次數
	while(a<=3*(n-1)) { //總共次數等於3*(n-1),依輸入的n不同而有差異
		
			int b=a%3; //檢察總次數是否跑到第"3的倍數"
			if(b==0) { //當總次數跑到第"3的倍數"時，就要將當次屬到的該格陣列中的數字輕零
				arr[j]=0;
			}
			j++; //重跑次數+1
			
			if(j>=n) { //當重討次數到達n次時，重新計算。
				j=0;
			}
			
			if(arr[j]!=0) { //當數到的該格陣列中的數字>0，表示為有效次數，所以計算總次數的a++，否則不+1
				a++;
			}
			
		
	}
	
	//建立一個整數用來存放答案
	for(int i=0;i<n;i++) { //檢查所有陣列中哪個陣列的數字>0
		if(arr[i]>0) {
			System.out.println(arr[i]); //存入ans
		}
	}
}
}
	
	/*int ans=0; //建立一個整數用來存放答案
	for(int i=0;i<n;i++) { //檢查所有陣列中哪個陣列的數字>0
		if(arr[i]>0) {
			ans=arr[i]; //存入ans
		}
	}
	System.out.println(ans); //輸出ans
	
}*/

