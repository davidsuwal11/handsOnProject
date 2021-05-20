package com.bigacademe.handsforjava.array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[]array= {1,2,3,4,5};
  int sum=0;
  for(int i=0; i<array.length; i++) {
	  sum=sum+array[i];
  }
 System.out.println("Sum of all element in array:" +sum);
}
}
