1.	public class TriangleCharacterPattern  
2.	{              
3.	public static void main(String[] args)  
4.	{  
5.	for (int i = 0; i <= 8; i++)   
6.	{  
7.	int alphabet = 65;   
8.	for (int j = 8; j > i; j--)  
9.	{  
10.	System.out.print(" ");  
11.	}  
12.	for (int k = 0; k <= i; k++)  
13.	{  
14.	System.out.print((char) (alphabet + k) + " ");  
15.	}  
16.	System.out.println();  
17.	}  
18.	}  
19.	}  
