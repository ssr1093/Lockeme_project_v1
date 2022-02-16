package com.Lockedme.RetreiveFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class RetrieveFile {
	public void RetrieveFileMethod() throws IOException 
	{
	Scanner user = new Scanner(System.in);
	{
        Stream<Path> files = Files.list(Paths.get(user.nextLine()));
         
        files.forEach(System.out::println);
         
        files.close();
    }

	user.close();
}
}
