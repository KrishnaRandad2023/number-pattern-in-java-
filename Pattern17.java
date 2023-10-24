1.	public class Pattern17  
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int rows=9;  
6.	//Prints upper half pattern  
7.	for (int i = 1; i <= rows; i++)   
8.	{  
9.	//Prints i spaces at the beginning of each row  
10.	for (int j = 1; j < i; j++)   
11.	{  
12.	System.out.print(" ");  
13.	}  
14.	//Prints i to rows value at the end of each row  
15.	for (int j = i; j <= rows; j++)   
16.	{   
17.	System.out.print(j);   
18.	}   
19.	System.out.println();   
20.	}   
21.	//Prints lower half  pattern   
22.	for (int i = rows-1; i >= 1; i--)   
23.	{  
24.	//Prints i spaces at the beginning of each row  
25.	for (int j = 1; j < i; j++)   
26.	{  
27.	System.out.print(" ");  
28.	}  
29.	//Prints i to rows value at the end of each row  
30.	for (int j = i; j <= rows; j++)  
31.	{  
32.	System.out.print(j);  
33.	}  
34.	System.out.println();  
35.	}  
36.	}  
37.	}  
