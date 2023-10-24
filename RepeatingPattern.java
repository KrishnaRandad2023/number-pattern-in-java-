1.	public class RepeatingPattern  
2.	{              
3.	public static void main(String[] args)  
4.	{  
5.	int letter = 65; //ASCII value of capital A is 65  
6.	//inner loop for rwos  
7.	for (int i = 0; i<= 9; i++)  
8.	{  
9.	//outer loop for columns  
10.	for (int j = 0; j <= i; j++)  
11.	{  
12.	//prints the character  
13.	System.out.print((char) letter + " ");  
14.	}  
15.	letter++;  
16.	System.out.println();  
17.	}  
18.	}  
19.	}  
