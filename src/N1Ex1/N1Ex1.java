package N1Ex1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class N1Ex1 {
	
	public static void main (String[]args) {
		
		//Path path = Paths.get("names");
		
		File archivo = new File ("names");
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());
		
		String[]name=archivo.list();
		Arrays.sort(name);
		System.out.println();
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		//ListDirectory directoryList = new ListDirectory(path);
		
		//for(Path pathDirectory : directoryList.getDirectoryList()) {
	//		System.out.println(pathDirectory);
		//}
		
	}
		

}
