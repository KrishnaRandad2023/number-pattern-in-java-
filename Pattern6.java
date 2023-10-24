1.	import java.util.*;  
2.	public class Pattern6  
3.	{  
4.	public static void main(String[] args)  
5.	{  
6.	int i, j, rows;  
7.	Scanner sc = new Scanner(System.in);  
8.	System.out.print("Enter the number of rows youy want to print: ");  
9.	rows = sc.nextInt();  
10.	for (i = rows; i >= 1; i--)  
11.	{  
12.	for (j = rows; j >= i; j--)  
13.	{  
14.	System.out.print(j+" ");  
15.	}  
16.	   
17.	System.out.println();  
18.	}  
19.	}  
20.	}  
