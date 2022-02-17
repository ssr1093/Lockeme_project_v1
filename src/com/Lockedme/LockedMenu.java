package com.Lockedme;
import java.io.IOException;
import java.util.Scanner;

import com.Lockedme.RetreiveFiles.*;
import com.Lockedme.Operations.*;

public class LockedMenu {

	public static void main(String[] args) throws IOException {
		int choice;
		Scanner entry = new Scanner(System.in);
		{
				System.out.println("\t\t*****************************");
				System.out.println("\t\tWELCOME TO LOCKEDME.COM");
				System.out.println("\t\t*****************************");
				
				System.out.println(" \n 1 To Retrive Files \n 2 To operations \n "
						+ "3 to Exit");
//				error occurs if enters an alphabet so wrapper class used
			
				 choice = Integer.parseInt(entry.nextLine());
				while (choice != 3) {
					if(choice == 1) {
						LockedMenu lockedmenu = new LockedMenu();
						lockedmenu.FirstMenu();
						break;
							}
					if (choice == 2) {
						LockedMenu lockedmenu = new LockedMenu();
						lockedmenu.SecondMenu();
						break;
						}
//					to redisplay the menu
					System.out.println("\t\t*****************************");
					System.out.println("\t\tWELCOME TO LOCKEDME.COM");
					System.out.println("\t\t*****************************");
					
					System.out.println(" \n 1 To Retrive Files \n 2 To operations \n "
							+ "3 to Exit");
//					to re use the user input function to make while loop alive
				
					 choice = Integer.parseInt(entry.nextLine());
				}
				}
				
			entry.close();
				
		} 
		
	
	
	
	
private void FirstMenu() throws IOException {
	Scanner entry2 = new Scanner(System.in);
	int ch2;
	System.out.println("\n 1 to Display files \n 2 to Search Files \n"
			+ " 3 to Main Menu");
	ch2  = Integer.parseInt(entry2.nextLine());
	while (ch2 != 3) {
		if (ch2 == 1) {
			RetrieveFile retrievefile = new RetrieveFile();
			retrievefile.RetrieveFileMethod();
			return;
		}
		if (ch2 == 2) {
			SearchFile searchfile = new SearchFile();
			searchfile.SearchFileMethod();
			return;
		}
		System.out.println("\n 1 to Display files \n 2 to Search Files \n"
				+ " 3 to Main Menu");
		ch2  = Integer.parseInt(entry2.nextLine());
		entry2.close();
		
	}

}




private void SecondMenu() {
	Scanner entry3 = new Scanner(System.in);
	int ch3;
	System.out.println("\n 1 to Create file \n 2 to Delete File "
			+ "\n 3 to Main menu");
	 ch3 = Integer.parseInt(entry3.nextLine());
	while (ch3 != 3) {
		if (ch3 == 1) {
			CreateFile createfile = new CreateFile();
			createfile.CreateFileMethod();
			return;
			}
		if (ch3 == 2) {
			DeleteFile deletefile = new DeleteFile();
			deletefile.DeleteFileMethod();
			return;
	
	}
		System.out.println("\n 1 to Create file \n 2 to Delete File "
				+ "\n 3 to Main menu");
		 ch3 = Integer.parseInt(entry3.nextLine());
		entry3.close();
	}
}
}
