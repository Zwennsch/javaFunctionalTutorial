package functionalinterface;

public class MyPredicate {
	
	public static void main(String[] args) {
		System.out.println("07000000000");
		System.out.println("08000asd0000");
	}
	
	static boolean isPhoneNumberValid(String number) {
		return number.startsWith("07")&& number.length() == 11;
	}

}
