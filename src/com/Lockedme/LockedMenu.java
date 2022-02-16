package com.Lockedme;
import java.util.Scanner;

import com.Lockedme.RetreiveFiles.*;
import com.Lockedme.Operations.*;

public class LockedMenu {

	public static void main(String[] args) {
		try (Scanner entry = new Scanner(System.in)) {
			while(true)
			{
				System.out.println(" \n 1 To Retrive Files \n 2 To operations \n "
						+ "3 to Exit");
				int num = entry.nextInt();
				switch ( num)
				{
				case 1:
					System.out.println("\n 1 to Display files \n 2 to Search Files \n"
							+ " 3 to Main Menu");
					int number = entry.nextInt();
					switch (number)
					{
					case 1:
						RetrieveFile retrievefile = new RetrieveFile();
						retrievefile.RetrieveFileMethod();
						break;
					case 2:
						SearchFile searchfile = new SearchFile();
						searchfile.SearchFileMethod();
						break;
					case 3:
						System.out.println("Back to Main Menu");
						break;
						
					default :
						System.out.println("Enter Valid Input");
					}
					break;
				case 2:
					System.out.println("\n 1 to Create file \n 2 to Delete File "
							+ "\n 3 to Main menu");
					int choice = entry.nextInt();
					switch (choice)
					{
					case 1:
						CreateFile createfile = new CreateFile();
						createfile.CreateFileMethod();
						break;
						
					case 2:
						System.out.println("22");
						break;
					case 3:
						System.out.println("23");
						break;
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
}
