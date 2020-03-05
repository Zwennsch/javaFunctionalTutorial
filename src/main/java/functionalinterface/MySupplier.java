package functionalinterface;

import java.util.function.Supplier;

public class MySupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getWord.get());
	}
	
	static Supplier<String> getWord = () -> "wort";

}
