1.	import java.util.Scanner;  
2.	public class DiamondCharacterPattern  
3.	{  
4.	public static void main(String[] args)   
5.	{  
6.	char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };  
7.	int alphabet _number = 0;  
8.	String[] diamond = new String[26]; // array of strings  
9.	System.out.print("Enter a Character between A to Z : ");  
10.	Scanner reader = new Scanner(System.in);  
11.	try   
12.	{  
13.	char user_ alphabet = reader.next("[A-Z]").charAt(0);  
14.	// search for letter number in the array letter  
15.	for (int i = 0; i < alphabet.length; i++)   
16.	{  
17.	if (letter[i] == user_ alphabet)   
18.	{  
19.	alphabet _number = i;  
20.	break;  
21.	}  
22.	}  
23.	//construct diamond  
24.	for (int i = 0; i <= alphabet _number; i++)   
25.	{  
26.	diamond[i] = "";  
27.	//add initial spaces  
28.	for (int j = 0; j < alphabet _number - i; j++)   
29.	{  
30.	diamond[i] += " ";  
31.	}  
32.	// add alphabet  
33.	diamond[i] += alphabet  
34.	//add space between letters  
35.	if (alphabet[i] != 'A')   
36.	{  
37.	for (int j = 0; j < 2 * i - 1; j++)   
38.	{   
39.	diamond[i] += " ";   
40.	}   
41.	// add alphabet  
42.	diamond[i] += alphabet[i];   
43.	}   
44.	// Draw the first part of the diamond   
45.	System.out.println(diamond[i]);   
46.	}   
47.	for (int i = alphabet _number - 1; i >= 0; i--)  
48.	{  
49.	// Draw the second part of the diamond  
50.	// prints the diamondArray in the reverse order  
51.	System.out.println(diamond[i]);  
52.	}  
53.	}  
54.	catch (Exception e)   
55.	{  
56.	e.printStackTrace();  
57.	}  
58.	finally   
59.	{  
60.	reader.close();  
61.	}  
62.	}  
63.	}  
