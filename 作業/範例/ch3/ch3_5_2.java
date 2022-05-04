package 作業.範例.ch3;
public class ch3_5_2
{
  public static void main(String[] args) 
  { //宣告及設定初值
      int N = 6,Sum;
    //處理
      Sum = Total(N);      //呼叫自定函數
    //輸出
      System.out.println("Sum=" + Sum);  
   }

  static int Total(int N)  //函數名稱
   {
    if (N <= 2)            //遞迴函數的終值
      return 1;
    else
      return Total(N-2) + Total(N - 1); //函數自己又可以呼叫自己
   }
}
