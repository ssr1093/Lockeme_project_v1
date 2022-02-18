package com.Lockedme.RetreiveFiles;

import java.util.Scanner;

public class Search {
	public static void SearchMethod() {
		Scanner ob = new Scanner(System.in);
		int choice = Integer.parseInt(ob.nextLine());
		while (choice != 3)
		{ 
			if(choice == 1) {
				Search searchusername = new Search();
				searchusername.SearchUser();
				return;
			}
			if(choice == 2) {
				Search searchfilename = new Search();
				searchfilename.SearchFile();
				
			}
			
		}
	return;
		
}
	private void SearchUser() {
		
	}
	
	private void SearchFile() {
		
	}
}
