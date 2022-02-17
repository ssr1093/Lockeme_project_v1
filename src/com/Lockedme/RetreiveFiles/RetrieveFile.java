package com.Lockedme.RetreiveFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class RetrieveFile {
	// all operations in the project folder/Resource/(username by user specified)
	

	public void RetrieveFileMethod() throws IOException 
	{
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
	         System.out.println("Either dir does not exist or is not a directory"); 
	      } else { 
	    	  System.out.println("List of Users with searched name");
	    	  for (int i = 0; i< children.length; i++) {
	            String filename = children[i];
	            System.out.println(filename);
	         } 
	         fname.close();
	      } 
}

	
}
