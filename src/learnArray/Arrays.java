package learnArray;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		
		/*String s = "Hello";		// format of declaring variable
		String ss = new String(); //format of declaring object
		Scanner abc = new Scanner(System.in);
		
		//[] ->> Array - it is a list
		
		int myIntArray[] = new int[3];
		boolean myboolArray[] = new boolean[5];
		
		String myArray[] = new String[3];
		myArray[0] = "john";
		myArray[1] = "Tim";
		myArray[2] = "Tom";
		//myArray[3] = "Sam";
		//myArray[4] = "Bob";
		
		System.out.println(myArray[2]);*/
	
		//String abc = "I love java";
		/*char toArr[] = abc.toCharArray();
		System.out.println(toArr[2]);*/
		
		/*1,000,000 ==> 1 million
		2,000 ==> 2 thousand*/
		
		System.out.println("Please enter a string seperated by comma");
		Scanner input = new Scanner(System.in);
		String myStr =  input.nextLine();
		System.out.println(myStr);
		String myStrList[] = myStr.split(",");
//		System.out.println(myStrList[0]);
//		System.out.println(myStrList[1]);
//		System.out.println(myStrList[2]);
		int myArrLen = myStrList.length;
		
		switch(myArrLen){
			
			case 2:
				System.out.println(myStrList[0]+ " Thousand");
				break;
			case 3:
				System.out.println(myStrList[0]+ " Million");
				break;
			case 4:
				System.out.println("Too much money");
				break;
			
			
		}
		
		
		/*
		if(myArrLen <= 1) {
			System.out.println("too low or wrong entry.");
		}
		
		else if(myArrLen == 2) {
			System.out.println(myStrList[0]+ " Thousand");
		}
		
		else if(myArrLen == 3) {
			System.out.println(myStrList[0]+ " Million");
		}
		
		else {
			System.out.println("Too much money");
		}*/
		
		
		
		
	}

}
