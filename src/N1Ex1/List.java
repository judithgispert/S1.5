package N1Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	
	private ArrayList<String> contentList;
	
	public List () {
		contentList = new ArrayList<String>();
	}
	
	public ArrayList<String> getContentList(){
		return contentList;
	}
	
	public ArrayList<String> fullList(){
		Scanner input = new Scanner (System.in);
		System.out.println("How many names do you want to put into the list?");
		int nameList = input.nextInt();
		
		input.nextLine();
		
		for (int cont = 0; cont < nameList; cont++) {
			System.out.println("Name :");
			String name = input.nextLine();
			contentList.add(name);
		}
		return contentList;
	}

}
