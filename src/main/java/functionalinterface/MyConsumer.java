package functionalinterface;

import java.util.function.Consumer;

public class MyConsumer {
	
	public static void main(String[] args) {
		Customer c = new Customer("Sven", "999-999.83274");
		greet(c);
		
//		using the Consumer: Functional Interface
		
		greet2.accept(c);
		
		
	}
	
	static Consumer<Customer> greet2 = c -> greet(c);
	
	static void greet(Customer c) {
		System.out.println("Hallo " + c.getCustomerName()+ ", Number:"+ c.getCustomerPhoneNumber());
		System.out.println();
	}
	
	static class Customer{
		public String getCustomerName() {
			return customerName;
		}

		public String getCustomerPhoneNumber() {
			return customerPhoneNumber;
		}

		private final String customerName;
		private final String customerPhoneNumber;
		
		public Customer(String name, String number){
			customerName = name;
			customerPhoneNumber = number;
		}
	}

}
