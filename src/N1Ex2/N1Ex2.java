package N1Ex2;

import java.io.File;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class N1Ex2 {
	
	public static void main (String[]args) {

		
		File directory = new File ("names"); 
		
		File []directoryNameList = directory.listFiles(); 
		
		
		if(directoryNameList == null || directoryNameList.length == 0) {
			System.out.println("Empty folder.");
		}else {
			//SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy");
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			Arrays.sort(directoryNameList);
			
			for(int cont = 0; cont < directoryNameList.length; cont++) {
				File tipe = directoryNameList[cont];
			
				if(tipe.isDirectory()) {
					System.out.println(tipe.getName() + " (D) " + dateFormat.format(new Date (tipe.lastModified())));
						
	
				}else if (tipe.isFile()) {
					System.out.println(tipe.getName() + " (F) " + dateFormat.format(new Date (tipe.lastModified())));
				}
			}	
			
		}
	}
}


