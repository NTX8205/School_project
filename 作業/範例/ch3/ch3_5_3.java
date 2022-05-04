package 作業.範例.ch3;
public class ch3_5_3
{
  public static void main(String[] args) 
  { //宣告及設定初值
      int a=18,b=15;
    //處理及輸出
      System.out.println("最大公因數為=" + GCD(a, b));  
   }

  static int GCD(int a,int b)  //函數名稱
  {
    int c;
    c = a % b;    //取餘數
    if (c == 0)
        return b;
    else
        return GCD(b, c);  //函數自己又可以呼叫自己
  }
}
