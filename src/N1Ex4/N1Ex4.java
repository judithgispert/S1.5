package N1Ex4;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class N1Ex4 {
	
	public static void main (String[]args) {
		
		File directory = new File ("names"); 
		
		File []directoryNameList = directory.listFiles(); 
		
		if(directoryNameList == null || directoryNameList.length == 0) {
			System.out.println("Empty folder.");
		
		}else {
			writeFile(directoryNameList);
			
		}
		
		readFile();
	}
	
	
///methods///
public static void writeFile(File[]directoryNameList) {
		
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	Arrays.sort(directoryNameList);
		
	try {
		FileWriter writeDirectory = new FileWriter ("write.txt");
		BufferedWriter bw = new BufferedWriter (writeDirectory);
		
		for(int cont = 0; cont < directoryNameList.length; cont++) {
					
			File tipe = directoryNameList[cont];
				
			if(tipe.isDirectory()) {
				writeDirectory.write(tipe.getName() + " (D) " + dateFormat.format(new Date (tipe.lastModified())) + " - ");	
				bw.newLine();
		
			}else if (tipe.isFile()) {
				writeDirectory.write(tipe.getName() + " (F) " + dateFormat.format(new Date (tipe.lastModified())) + " - ");
				bw.newLine();
			}
		}
		writeDirectory.close();
			
	}catch(Exception ex) {
		System.out.println("Error.");
	}
}
	
	
	
public static ArrayList<String> readFile (){
	ArrayList <String> getFile = new ArrayList<String>(); 
		
	try {
		File myFile = new File ("write.txt");
		Scanner myReader = new Scanner(myFile);
		while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
			
	}catch (Exception ex) {
		System.out.println("Error.");
	}
		
	return getFile;
		
}

}
