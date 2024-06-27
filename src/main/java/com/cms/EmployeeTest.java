package com.cms;

import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]={2,3,4,5,6};
		
		
		
		//int []newArray=new int[5];
		//int []newArray=new int[arr.length];
		
		// Iteration by index
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("Lenght-->"+(arr.length));//5
		// iteration by for loop
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");//2 3 4 5 6
		}
		System.out.println();
		// iterate by for each loop
		for(int komal:arr)
		{
			System.out.println(komal);
		}
		
		
	}

}
