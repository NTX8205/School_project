import java.util.Scanner;
public class W3_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  [ ]arr=new int[n];
        int  [ ]arr2=new int[n];
        for(int i=0;i<n;i++) {
        	arr[ i ]= (int)(Math.random()*100);
        	arr2[ i ]=arr[ i ];
        }
        System.out.print("初始陣列:");
        for(int i=0;i<arr.length;i++) {
        	System.out.printf("%d ",arr[ i ] );
        }
        Arrays.sort(arr2);
        System.out.print("\n排序過的:" );
        for(int i=0;i<arr2.length;i++) {
        	System.out.printf("%d  ",arr2[ i ] );
        }
        System.out.print("\nIndex of array:");
        for(int i=0;i<arr.length;i++) {
        	  for(int j=0;j<arr2.length;j++) {
        		    if(arr[ i ]==arr2[ j ]) {
        		    	System.out.printf("%d  ",j+1 );
        		    	
        		    }
        	  }
        }
	}

}

