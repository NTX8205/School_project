package 作業.範例.排序法;

import java.io.*;

public class insert_sort extends Object{
    
    int data[]=new int[6];
    int size=6;
    public static void main(String[] args) {
        
        insert_sort sort = new insert_sort();
        sort.inputarr();
        System.out.print("您輸入的原始陣列是:");
        sort.showdata();
        sort.insert();
    }

    void inputarr(){
        for (int i=0;i<size;i++){

            try {
                System.out.print("請輸入第"+(i+1)+"個數元素:");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                data[i]=Integer.parseInt(br.readLine());
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

    void showdata(){

        for (int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    void insert(){

        for(int i=0;i<size;i++){

            int temp=data[i];
            int j = i-1;
            while (j>=0 && temp<data[j]){
                data[j+1]=data[j];
                j--;
                
            }
            System.out.print("第" + i + "次掃描:");
            showdata();
        }
    }
}
