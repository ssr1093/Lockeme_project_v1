package com.Lockedme.Operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CreateFile {
	public static void CreateFileMethod() {
		final String filepath = "Resources\\";
		Scanner scanner = new Scanner(System.in);
		String  filepath1 = " ";
		System.out.println("Enter Desired user name to Create");
		filepath1 = filepath+scanner.next();
		File f = new File(filepath1);
		if(f.mkdir()) {
			System.out.println("User created Successfully");
			System.out.println("***CREATE FILE**");
			System.out.println("Enter File Name to be created");
			String filename = scanner.nextLine(); 
//			creating File in the created user
			File f1 = new File(filename);
			
		}
		else {
			System.out.println("User already Exists");
			System.out.println("***CREATE FILE**");
			System.out.println("Enter File Name to be created");
			String filename = scanner.nextLine(); 
//			creating File in the created user
			File f1 = new File(filename);
		}
	}
}

