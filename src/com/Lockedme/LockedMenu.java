package com.Lockedme;
import java.util.Scanner;

import com.Lockedme.RetreiveFiles.*;
import com.Lockedme.Operations.*;

public class LockedMenu {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
	while(true)
	{
		int number = entry.nextInt();
		switch ( number)
		{
		case 1:
			
			int number1 = entry.nextInt();
			switch (number1)
			{
			case 1:
				System.out.println("11");
				break;
			case 2:
				System.out.println("12");
				break;
			case 3:
				System.out.println("Back to Main Menu");
				continue;
				
			default :
				System.out.println("Enter Valid Input");
			}
			break;
		case 2:
			int number3 = entry.nextInt();
			switch (number3)
			{
			case 1:
				System.out.println("21");
				break;
				
			case 2:
				System.out.println("22");
				break;
			case 3:
				System.out.println("23");
				continue;
			default :
				System.out.println("Invalid Input");
				break;
			}
		break;
			
		case 3:
			System.out.println("Exiting the application");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Enty \n"
					+ "Please try again");
			break;
		}
	}
	}
}
