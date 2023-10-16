package N1Ex5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class N1Ex5 {

	public static void main (String[]args) {
		
		Data person1 = new Data ("Ariadna", 23, "76514233S");
		FileOutputStream file = null;
		
		try {
			file = new FileOutputStream("people.ser");
			ObjectOutputStream canal = new ObjectOutputStream (file);
			canal.writeObject(person1);
			System.out.println("Successfully wrote to the file.");
			
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
			
		}catch (IOException exIO1) {
			exIO1.printStackTrace();
			
		}finally {
			try {
				file.close();
			}catch (IOException exIO2){
				exIO2.printStackTrace();
			}
		}
		
		FileInputStream fileInp = null;
		
		try {
			fileInp = new FileInputStream ("people.ser");
			ObjectInputStream canalInp = new ObjectInputStream (fileInp);
			System.out.println((Data)canalInp.readObject());
			canalInp.close();
			
		}catch (Exception ex2){
			ex2.printStackTrace();	
		}
			
	}
}
