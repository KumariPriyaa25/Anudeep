package com.alternate;

public class alternate {

	public static void main(String[] args) {
		int []arr1 = {5,10,15,20,25,30,35,40,45,50};
		int []arr2 = new int[5];
		alternateArray(arr1,arr2);
	}
	
	public static void alternateArray(int []arr1,int []arr2) {
		int j=0;
		for(int i=0; i<arr1.length;i+=2) {
			arr2[j]=arr1[i];
			j++;
		}
		sumofArray(arr2);
	}
	
	public static void sumofArray(int []arr2) {
		int sum=0;
		for(int i=0; i<arr2.length;i++) {
			sum=sum+arr2[i];
		}
		System.out.print("Total Sum is: "+sum);
		
	}

}
