package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Read {
	
	public static void main(String[] args) {
		
		String text = null;
		
		// 1. set the path
		String filePath = "C:\\Users\\koncole\\Desktop\\Fiori_Kurs\\OpenSAP_Java\\eclipse-workspace\\files\\FileToRead.txt";
		
		// 2. create the in Java
		File file = new File(filePath);
		
		
		try {
			
			// 3. open the file
			BufferedReader br;
			br = new BufferedReader(new FileReader(file));
			
			// 4. read text from file
			text = br.readLine();
			
			// 5. close the resource
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: File could not find: " + filePath);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read data: "+ filePath);
			e.printStackTrace();
		}finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		
		
		
	}

}
