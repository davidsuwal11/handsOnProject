package com.bigacademe.handsforjava.array;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,7,6,2,8,3};
		int temp=0;
		
		System.out.println("Elements of original array; ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}

	
		for(int i=0;i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
       
		System.out.println();
		
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i=0;i<a.length; i++) {
			System.out.println(a[i]+ "");
		}
	}
}


