/*
// 1.Write a program to print a series of numbers with recursive Java methods

class Series_Number
{
	static int m=10;
	static int display(int n)
	{

		if(n==m)
		{
			return n;
		}
		else
		{
			System.out.println(n +" ");
		}
		return display(n+1);
	}

	public static void main(String [] args)
	{
		
		System.out.println(display(1));
	}
} 
*/

/* 
// 2 Write a program to sum a series of numbers with Java recursion

import java.util.Scanner;
class SumSeries {

    static int Sum(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + Sum(n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :   ");
        int n = sc.nextInt();
        System.out.println("Addition of number upto "+n+" is  : "+ Sum(n));
    }
}

 */

/*
//3. Write a program to calculate a factorial in Java with recursion

class Recursion_Factorial
{
	static int fact(int n)
	{
		
		if(n==1) 
		{
			return 1;
		}	
		else
		{
			return n*fact(n-1);
		}
	}
	
	public static void main(String []args)
	{
		System.out.println(fact(5));
	}
}
*/


/*

 //4 Write a program to print the Fibonacci series with Java and recursion

import java.util.Scanner;
class Recursion_Fibonaci
{
	
	static int fibo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
	
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(fibo(n));
	}
} 

*/

/*


//7 Recursive Program to print multiplication table of a number

import java.util.*;

class MultipleTable_Rucr
{
	static int multitable(int n, int i)
	{
		if(i >10)
			return n;
		
		System.out.println(n+ " * " +i+ " = " +n*i);
		return multitable(n, i+1);
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		int n= sc.nextInt();
		multitable(n, 1);
		
		
	}
	
} 

*/

//6	Recursive program to find the Sum of the series 1 – 1/2 + 1/3 – 1/4 … 1/N


//5 To check if Palindrome
