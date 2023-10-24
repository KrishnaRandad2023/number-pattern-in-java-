1.	public class RightAlphabaticPattern  
2.	{              
3.	public static void main(String[] args)  
4.	{  
5.	int alphabet = 65; //ASCII value of capital A is 65  
6.	//inner loop for rows  
7.	for (int i = 0; i <= 8; i++)  
8.	{  
9.	//outer loop for columns      
10.	for (int j = 0; j <= i; j++)  
11.	{  
12.	//adds the value of j in the ASCII value of A and prints the corresponding alphabet  
13.	System.out.print((char) (alphabet + j) + " ");   
14.	}  
15.	System.out.println();  
16.	}  
17.	}  
18.	}  
