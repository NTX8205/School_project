import java.util.*;
public class Q1 {

		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
            int [] data = new int [n];
			int remain = n;
			int count = 0;
			int out = -1;
			while(remain >1){
				for(int i = 0; i < n; i++){
					if(data[i] != out){
						count++;
						if(count == 3){
							count = 0;
							remain--;
							data[i] = out;
						}
					}
				}
			}
				for(int i = 0; i < n; i++){
					if(data[i] != out){
						System.out.println(i+1);
					}
				}
		}
	}