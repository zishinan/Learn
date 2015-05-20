package com.ouyang.demo;

public class NineMulitTable {
	public void nineNineMulitTable(){  
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
