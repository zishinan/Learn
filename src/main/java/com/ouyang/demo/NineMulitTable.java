package com.ouyang.demo;

public class NineMulitTable {
	public static void main(String[] args) {
		NineMulitTable.nineNineMulitTable();
	}
	
	/**
	 * 九九乘法表
	 */
	public static void nineNineMulitTable(){  
	    for (int i = 1,j = 1; j <= 9; i++) {   
	          System.out.print(i+"*"+j+"="+i*j+" ");   
	          if(i==j){   
	              i=0;   
	              j++;   
	              System.out.println();   
	          }   
	      }   
	} 
}
