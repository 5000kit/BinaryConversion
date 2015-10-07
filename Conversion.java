import java.util.Scanner;

public class Conversion
{	
	private static int[] Binary = new int[8];
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int howMany = 0;
		
		String checker = "";
		
		boolean hex = false;
		
		System.out.print("Do you wish to convert to or from Binary? (b or n or q for quit) ");
		checker = in.nextLine();
		if(checker.equalsIgnoreCase("q"))
		{
			return;
		}
		else if(checker.equalsIgnoreCase("b"))
		{
			System.out.print("How many numeric values will you enter? ");
			howMany = in.nextInt();
			
			in.nextLine();
			
			System.out.print("Do you wish to convert binary into Hexidecimal? (y or n) ");
			String target = in.nextLine();
			
			if(target.equalsIgnoreCase("y"))
			{
				hex = true;
			}
			else if(target.equalsIgnoreCase("n"))
			{
				hex = false;
			}
			else
			{
				System.out.println("Sorry something broke our flying monkeys are en route to fix");
				main(null);
			}
			
			convert(howMany,hex);
		}
		else if(checker.equalsIgnoreCase("n"))
		{
			reverseBinary();
		}
		else
		{
			System.out.println("Sorry something broke our flying monkeys are en route to fix");
			main(null);
		}
			
		
	}
	
	public static void convert(int r, boolean h)
	{
		int selected, temp = 0;
		
		if(r == 0)
		{
			System.out.println("\nDone!");
			return;
		}
		
		System.out.println("");
		
		System.out.print("Please enter numeric number: ");
		selected = in.nextInt();
		
		int which = 0;
		int amount = 0;
		
		if(selected > 255)
		{
			System.out.println("Please input something equal to or less than 255");
			
			convert(r,h);
		}
		else if(selected <= 255)
		{
			which = 8;
			amount = 128;
		}
		
		temp = selected;
		
		for(int index = 0; index < which; index++)
		{
			if(temp - amount >= 0)
			{
				Binary[index] = 1;
				temp -= amount;
			}
			else
			{
				Binary[index] = 0;
			}
			
			amount /= 2;
		}
		
		for(int index = 0; index < Binary.length; index++)
		{
			System.out.print(Binary[index]);
		}
		
		
		if(h)
		{
			r -= 1;
			
			hexConverter(r,h);
		}
		else
		{
			convert(r - 1, h);
		}
	}
	
	public static void hexConverter(int br, boolean cont)
	{
		String[] hexCon = new String[2];
		
		int i1 = Binary[0], i2 = Binary[1], i3 = Binary[2], i4 = Binary[3];
		
		int i5 = Binary[4], i6 = Binary[5], i7 = Binary[6], i8 = Binary[7];
		
		String str1 = Integer.toString(i1), str2 = Integer.toString(i2);
		
		String str3 = Integer.toString(i3), str4 = Integer.toString(i4);
		
		String str5 = Integer.toString(i5), str6 = Integer.toString(i6);
		
		String str7 = Integer.toString(i7), str8 = Integer.toString(i8);
		
		String combo1 = str1 + str2 + str3 + str4;
		
		String combo2 = str5 + str6 + str7 + str8;
		
		if(combo1.equals("0000"))
		{
			hexCon[0] = "0";
		}
		else if(combo1.equals("0001"))
		{
			hexCon[0] = "1";
		}
		else if(combo1.equals("0010"))
		{
			hexCon[0] = "2";
		}
		else if(combo1.equals("0011"))
		{
			hexCon[0] = "3";
		}
		else if(combo1.equals("0100"))
		{
			hexCon[0] = "4";
		}
		else if(combo1.equals("0101"))
		{
			hexCon[0] = "5";
		}
		else if(combo1.equals("0110"))
		{
			hexCon[0] = "6";
		}
		else if(combo1.equals("0111"))
		{
			hexCon[0] = "7";
		}
		else if(combo1.equals("1000"))
		{
			hexCon[0] = "8";
		}
		else if(combo1.equals("1001"))
		{
			hexCon[0] = "9";
		}
		else if(combo1.equals("1010"))
		{
			hexCon[0] = "A";
		}
		else if(combo1.equals("1011"))
		{
			hexCon[0] = "B";
		}
		else if(combo1.equals("1100"))
		{
			hexCon[0] = "C";
		}
		else if(combo1.equals("1101"))
		{
			hexCon[0] = "D";
		}
		else if(combo1.equals("1110"))
		{
			hexCon[0] = "E";
		}
		else if(combo1.equals("1111"))
		{
			hexCon[0] = "F";
		}
		
		//Hex index 1 - second half of binary
		
		if(combo2.equals("0000"))
		{
			hexCon[1] = "0";
		}
		else if(combo2.equals("0001"))
		{
			hexCon[1] = "1";
		}
		else if(combo2.equals("0010"))
		{
			hexCon[1] = "2";
		}
		else if(combo2.equals("0011"))
		{
			hexCon[1] = "3";
		}
		else if(combo2.equals("0100"))
		{
			hexCon[1] = "4";
		}
		else if(combo2.equals("0101"))
		{
			hexCon[1] = "5";
		}
		else if(combo2.equals("0110"))
		{
			hexCon[1] = "6";
		}
		else if(combo2.equals("0111"))
		{
			hexCon[1] = "7";
		}
		else if(combo2.equals("1000"))
		{
			hexCon[1] = "8";
		}
		else if(combo2.equals("1001"))
		{
			hexCon[1] = "9";
		}
		else if(combo2.equals("1010"))
		{
			hexCon[1] = "A";
		}
		else if(combo2.equals("1011"))
		{
			hexCon[1] = "B";
		}
		else if(combo2.equals("1100"))
		{
			hexCon[1] = "C";
		}
		else if(combo2.equals("1101"))
		{
			hexCon[1] = "D";
		}
		else if(combo2.equals("1110"))
		{
			hexCon[1] = "E";
		}
		else if(combo2.equals("1111"))
		{
			hexCon[1] = "F";
		}
		
		
		System.out.print(" Hex value: " + hexCon[0] + hexCon[1]);
		
		if(br == 0)
		{
			cont = false;
		}
			convert(br,cont);
				
	}
	
	public static void reverseBinary()
	{
		for(int index = 0; index < Binary.length; index++)
		{
			int tempB = index + 1;
			
			System.out.print("Enter binary number digit " + tempB + " (left to right) ");
			int entryB = in.nextInt();
			
			if(entryB == 1 || entryB == 0)
			{
				Binary[index] = entryB;
			}
			else
			{
				System.out.println("Error restarting Binary entry! Send in the monkeys!");
				reverseBinary();
			}
		}
		
		int answer = 0;
		
		int count = 0;
		
		if(Binary.length == 8)
		{
			count = 128;
		}
		
		for(int index = 0; index < Binary.length; index++)
		{
			if(Binary[index] == 1)
			{
				answer += count;
			}
			
			count /= 2;
		}
			
			System.out.println(answer);
			
			in.nextLine();
			
			System.out.print("Would you like to enter another Binary number? (y or n) ");
			String choice = in.nextLine();
			
			if(choice.equalsIgnoreCase("y"))
			{
				reverseBinary();
			}
			else if(choice.equalsIgnoreCase("n"))
			{
				main(null);
			}
			else
			{
				System.out.println("Sorry something broke our flying monkeys are en route to fix");
				return;
			}
	}
}