package com.Lockedme.RetreiveFiles;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RetrieveFile {
	public void RetrieveFileMethod() //throws null 
	{
	Scanner user = new Scanner(System.in);
	try
	{
//	File folders = new File(user.nextLine());
	File folders = new File("D:\\Simplilearn");
	if(folders.isDirectory());
	{
		File[] files = folders.listFiles();
		
		for (int i = 0; i < files.length; i++)
		{			
			System.out.println(i);
		}
	}
	}
	catch (NoSuchElementException e) {
		System.out.println("Please Enter Valid User");
	}
	user.close();
}
}
