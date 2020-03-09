package finalsection;

import java.util.function.Consumer;

public class MainCallbacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello("Sven", null, value -> {
			System.out.println("Sorry, ");
			System.out.println(value);
			System.out.println("Last name is not provided");
		});

	}
	
	/*
	 * In JS a function looks like this:
	 * function hello(firstname, lastName, callback){
	 * 		console.log(firstname);
	 *		if((lastName){
	 * 			console.log(lastName);
	 * 		}else{
	 * 			callback();
	 * 		}
	 * }
	 * 	
	 * We can use the same callback mehtods in Java
	 */
	
	static void hello(String firstName, String lastName, Consumer<String> callback) {
		System.out.println(firstName);
		if (lastName != null) {
			System.out.println("; " +lastName);
		}else {
			callback.accept(firstName);
		}
	}

}
