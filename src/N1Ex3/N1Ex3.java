package N1Ex3;

import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class N1Ex3 {
	
	public static void main(String[]args) {
		
		File directory = new File ("names"); 
		
		
		File []directoryNameList = directory.listFiles(); 
		
		
		if(directoryNameList == null || directoryNameList.length == 0) {
			System.out.println("Empty folder.");
		}else {
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			Arrays.sort(directoryNameList);
			
			try {
				FileWriter writeDirectory = new FileWriter ("write.txt");
			
				for(int cont = 0; cont < directoryNameList.length; cont++) {
						
					File tipe = directoryNameList[cont];
					
					if(tipe.isDirectory()) {
						writeDirectory.write(tipe.getName() + " (D) " + dateFormat.format(new Date (tipe.lastModified())) + " - ");	
			
					}else if (tipe.isFile()) {
						writeDirectory.write(tipe.getName() + " (F) " + dateFormat.format(new Date (tipe.lastModified())) + " - ");
					}
				}
				writeDirectory.close();
				System.out.println("Successfully wrote to the file.");
				
			}catch(Exception ex) {
				System.out.println("Error.");
			}
		}
	}

}
