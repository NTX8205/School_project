//W4_Q3圓括號對應
//
//班級:資管二B
//學號:410917554
//姓名:林冠廷
//
//date:2022/3/21
import java.util.*;
public class W4_Q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char [] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==')')
            {
                for(int j=i;j>=0;j--)
                {
                    if(c[j]=='(')
                    {
                        System.out.print(j+","+i);
                        System.out.println();
                        c[i]=0;
                        c[j]=0;
                        break;
                    }
                    if(j==0&&c[j]!='(')
                    {
                        System.out.println(",-1"+i);
                    }
                }
            }
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='(')
            {
                System.out.println(i+",-1");
            }
        }
    }
}
