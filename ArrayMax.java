package practice;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		int[] a= new int[3];
		a[0]=19;
		a[1]=89;
		a[2]=79;
		
		System.out.println("Given Array:"+Arrays.toString(a));
		int MaxValue=a[0];
		
		for (int i = 1; i < a.length; i++) {
            if (a[i] > MaxValue) {
            	MaxValue  = a[i]; 
            }
            
		System.out.println("Max Value is:"+MaxValue);
		
		
	}
	}

}
