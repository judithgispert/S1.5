package N1Ex5;

import java.io.Serializable;

public class Data implements Serializable{
	
	private String name;
	private int age;
	private String dni;
	
	public Data (String name, int age, String dni) {
		this.name = name;
		this.age = age;
		this.dni = dni;
	}
	
	public String toString(){
		return name + ", " + age + " years old. DNI: " + dni;
	}

}
