package com.cms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test123 {
	public static void main(String[] args) {

		String str = "ABABBCCAD";
		//

		/*
		 * A = 3
		 * 
		 * B = 3
		 * 
		 * C = 2
		 * 
		 * D = 1
		 */
// 
		char ch[] = str.toCharArray();// A,B,A
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i]))// a
			{
				map.put(ch[i], map.get(ch[i]) + count);
			}

			else {
				map.put(ch[i], count);// a=1,b=1
			}
		}

		System.out.println(map);

		
		// using stream
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);//
		 
		int [] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		
		int first=Integer.MIN_VALUE;//-33232
		int second=Integer.MIN_VALUE;
		
		for (int i = 0; i < myArray.length; i++) {
			
			if(myArray[i]>first)
			{	
				second=first;
				first=myArray[i];//85
			}
			
			if(myArray[i]>second&& myArray[i]!=first)
			{
				
				second=myArray[i];
			}
		}
		 
		 
		 
		 
		 
		 
		 

		 
		 List<Integer> collect = myList.stream().filter(p->p%2==0).collect(Collectors.toList());
		
		  /*List<String> collect =myList.stream().map(m->m.toString()).filter(m->m.startsWith("1")).
		  collect(Collectors.toList());*/
		 
		 System.out.println(collect);
		 

		// Write your code here

	}

}
