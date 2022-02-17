package com.Lockedme.RetreiveFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class RetrieveFile {
	

	public void RetrieveFileMethod()	{
		
		RetrieveFile retrievefile = new RetrieveFile();
		retrievefile.ListFilesmethod();
}

	private void listUsermethod() {
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
	private void ListFilesmethod() {
		Scanner fname2 = new Scanner(System.in);
		String uNmae = fname2.nextLine();
		System.out.println("Enter the above listed UserName");
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
