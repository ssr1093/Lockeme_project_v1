package com.Lockedme.RetreiveFiles;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class RetrieveFile {
	// all operations in the project folder/Resource/(username by user specified)
	static final String filespath = "Resources\\";

	public void RetrieveFileMethod() throws IOException 
	{
	Scanner user = new Scanner(System.in);
	{
        Stream<Path> files = Files.list(Paths.get(filespath));
         
        files.forEach(System.out::println);
         
        files.close();
    }

	user.close();
}

	
}
