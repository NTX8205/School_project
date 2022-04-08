// Q1：九九乘法表(使用三種不同迴圈)
// 班級:資管二B
// 學號:41098050
// 姓名:許哲睿



public class Q1 
{
    public static void main(String[] args) 
    {
        System.out.println("九九乘法表 (使用三種不同迴圈)");
        System.out.println();
        System.out.println("使用for迴圈");
        System.out.println();
        showTop();
        forLoop();
        System.out.println();
        System.out.println("使用do_while迴圈");
        System.out.println();
        showTop();
        do_while();
        System.out.println();
        System.out.println("使用while迴圈");
        System.out.println();
        showTop();
        whileLoop();
        System.out.println();

    }

    public static void showTop()
    {
        System.out.print("    ");
        for(int i=0;i<9;i++)
        {
            System.out.print((i+1)+"----- ");
        }
        System.out.println();
    }

    public static void forLoop() 
    {
        for(int i =1; i<=9;i++){

            System.out.print(i+" | ");

            for(int j = 1 ; j<=9;j++)
            {
                System.out.printf("%d*%d=%2d ",i,j,i*j);
            }
            System.out.println();
        }
    }

    public static void do_while() 
    {
        int n =1;
        do
        {
            int m=1;
            System.out.print(n+" | ");
            do
            {
                System.out.printf("%d*%d=%2d ",n,m,n*m);
                m++;
            }
            while(m<=9);

            System.out.println();
            n++;

        }
        while(n<=9);
    }

    public static void whileLoop() 
    {
        int k=1;
        while(k<=9)
        {
            System.out.print(k+" | ");
            int l =1;

            while(l<=9)
            {
                System.out.printf("%d*%d=%2d ",k,l,k*l);
                l++;
            }
            System.out.println();
            k++;
        }
    }
}