//Q1: 排序次序
//
//班級:資管二B
//學號:410917724
//姓名:黃硯祥
//
//date:2002/03/09

import java.util.*;
public class W3_Q1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();

        System.out.printf("請使用者輸入一正整數:");
        int n=sc.nextInt();
        int [] a=new int [n];
        int [] b=new int [n];
        int [] c=new int [n];

        System.out.println("原來的:");

        if(n<=10)
        {
            for(int i=0; i<n ;i++)
            {
                a[i]=rand.nextInt(100);
                b[i]=a[i];
                System.out.printf("%d ",a[i]);
            }

            System.out.println(" ");
            System.out.println("排序後:");

            Arrays.sort(a);

            for(int i=0 ;i<a.length ;i++)
            {
                System.out.printf("%d ",a[i]);
            }

            System.out.println(" ");
            System.out.println("原來的大小排序:");
            
            for(int i=0 ; i<a.length ;i++)
            {
                for(int j=0 ;j<a.length ;j++) 
                {
                    int ct=-1;                       
                    if(b[i]==a[j])      
                    {
                        System.out.printf("%d ",j+1);
                        if(i%1==0)
                        {
                            b[i]+=ct*(i+1)-11;//做完判斷後塞一個負值(基數)進去對應的b陣列裡
                            a[j]+=ct*(i+1);   //負值(偶數)
                        }else
                        {
                            b[i]+=ct*1*(i+1);
                            a[j]+=ct*(i+1)-11;
                        }       
                    }
                }
            }
        }
    }
}