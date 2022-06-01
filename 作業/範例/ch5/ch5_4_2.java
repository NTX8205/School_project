package 作業.範例.ch5;

import java.util.*;
import java.io.*;

public class ch5_4_2
{
 public static void main(String args[])
  {
	int start_node=1,end_node=6;
	
	String Sum_Node[]={"head","10","50","30","40","20","null"};
	
	LinkedList LL=new LinkedList();  //建立一個空的鏈結串列
	System.out.println("建立一個鏈結串列：");
	
	while(start_node<=end_node)
	  {
	     LL.addLast(Sum_Node[start_node]);
	     start_node++;
	  }
	  
	while(LL.getFirst()!="null")
	  {
	     System.out.print(LL.getFirst()+"->");
	     LL.removeFirst();
	  }
	System.out.print("null");
  }
}