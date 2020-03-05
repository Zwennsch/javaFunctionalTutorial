package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
	
	public static void main(String[] args) {
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("08000asd0000"));
		
		boolean isPhoneNrValid = phoneNr.test("07000000000");
		System.out.println(isPhoneNrValid);
		
//		combining predicates: Both predicates do have to have the same generic types bzw. super types
		System.out.println("combining");
		System.out.println(phoneNr.and(containsNr).test("07000000000"));
		System.out.println(phoneNr.and(containsNr).test("08000000000"));
//		with or instead of and
		System.out.println(phoneNr.or(containsNr).test("07000000000"));
//		test BiPredicate
		System.out.println("BiPredicate");
		System.out.println(isOfLenght.test("hallo", 5));
		System.out.println(isOfLenght.test("hallo", 6));
	}
	
	static boolean isPhoneNumberValid(String number) {
		return number.startsWith("07")&& number.length() == 11;
	}
	
//	same with predicate
	static Predicate<String> phoneNr = nr -> nr.startsWith("07")&& nr.length()==11;
	
	static Predicate<String> containsNr = number -> number.contains("09");
	
	static BiPredicate<String, Integer> isOfLenght  = (word, number) -> word.length() == number;

}
