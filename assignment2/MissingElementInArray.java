package week1.day2.assignment2;

import java.util.Arrays;

public class MissingElementInArray {
public static void main(String[] args) {
	int [] array = {1,2,3,4,7,6,8};
	Arrays.sort(array);
	for (int i = 0; i <array.length; i++) {
		System.out.println(array[i]);
		
	}
	
	int [] a = {1,2,3,4,6,7,8};
	//sum of elements with missing=1+2+3+4+6+7+8=31--sum1
	//sum of elements without missing=1+2+3+4+5+6+7+8=36-- sum2
	//missing number = sum2-sum1
	
	int sum1 =0;
	for(int i = 0; i<a.length;i++)
	{
		sum1 = sum1+a[i];
	}
	System.out.println("Sum of elements in Array  "+sum1);
	
	int sum2 = 0;
	for(int i = 1;i<=8;i++)
	{
		sum2 = sum2+i;
	}
	System.out.println("Sum of range of elements in the array  "+ sum2);
	
	
	System.out.println("Missing element in the array is   "+ (sum2 - sum1));
	
	
}
}