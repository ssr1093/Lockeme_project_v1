package com.Lockedme.RetreiveFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Retrieve {
	

	public static void RetrieveMethod()  	{
		try
		{
		Scanner ob = new Scanner(System.in);
		int choice = ob.nextInt();
		while(choice != 3)
		{
			if (choice == 1)
			{		
				Retrieve listusernames = new Retrieve();
				listusernames.listUsermethod();
				} 
			else if (choice == 2) {
				Retrieve retrievefile = new Retrieve();
				retrievefile.ListFilesmethod();
				}
		}
		ob.close();
		}
		catch (NoSuchElementException e) {
			e.printStackTrace();
		
			}
	}
		
	

	private static void listUsermethod() throws NoSuchElementException {
		Scanner fname = new Scanner(System.in);
		System.out.print("Enter User Name (Starts with eg: for Ramaa, just enter Ram):");
		String f = fname.nextLine();
		File dir = new File("Resources\\");
	      FilenameFilter filter = new FilenameFilter() {
	         public boolean accept (File dir, String name) { 
	            return name.startsWith(f);
	         } 
	      }; 
	      String[] children = dir.list(filter);
	      if (children == null) {
	         System.out.println("Either dir does not exist or is not a User"); 
	      } else { 
	    	  System.out.println("List of Users with searched name");
	    	  for (int i = 0; i< children.length; i++) {
	            String filename = children[i];
	            System.out.println(filename);
	         } 
	         fname.close();
	      } 
	}
	private static void ListFilesmethod() {
		Scanner fname2 = new Scanner(System.in);
		System.out.println("Enter the above listed UserName");
		String uNmae = fname2.nextLine();
		
		File directoryPath = new File(uNmae);
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      System.out.println("List of files in the specified UserLock:");
	      for(int i=0; i<contents.length; i++) {
	         System.out.println(contents[i]);
	      }
		fname2.close();
	}
	
}
