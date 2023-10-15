package N1Ex1;

import java.io.File;
import java.util.Arrays;

public class N1Ex1 {
	
	public static void main (String[]args) {
		
		File directory = new File ("names"); 
		System.out.println(directory.getAbsolutePath());
		System.out.println(directory.exists()); 
		
		String[]directoryNameList = directory.list(); 
		Arrays.sort(directoryNameList);
		
		for(int cont = 0; cont < directoryNameList.length; cont++) {
			System.out.println(directoryNameList[cont]); 
		}
		
	}
		

}
