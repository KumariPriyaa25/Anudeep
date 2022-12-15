package com.matrix;

public class matrix {
	int a[][]= {{1,3,7},{2,5,7}};
	int b[][] = {{5,4,3},{3,8,1}};
	int sum[][]= new int[2][2];
	System.out.println("first matrix data");
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			System.out.println(a[i][j]+" ");
		}
		System.out.println();
	}
    System.out.println("Second matrix data");
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			System.out.println(b[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("addition of two matrix ");
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			sum[i][j]=a[i][j]+b[i][j];
		}
    }
	
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
    }
	
}
