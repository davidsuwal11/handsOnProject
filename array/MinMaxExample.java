package com.bigacademe.handsforjava.array;

public class MinMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int array[]=new int[] {10,9,7,12,15,8};
  
  
  
  int max=getMax(array);
  System.out.println("Maximum Value is: "+max);
  
  
  int min=getMin(array);
  System.out.println("Minimun Value is: "+min);
  
	}
	
	public static int getMax(int[]inputArray) {
		int maxValue=inputArray[0];
		for(int i=1;i<inputArray.length;i++) {
		if(inputArray[i] >maxValue) {
			maxValue=inputArray[i];
		}
	}
   return maxValue;
}
	public static int getMin(int[]inputArray) {
		int minValue=inputArray[0];
		for(int i=1;i<inputArray.length;i++) {
		if(inputArray[i] <minValue) {
			minValue=inputArray[i];
		}
	}
   return minValue;
}
}
