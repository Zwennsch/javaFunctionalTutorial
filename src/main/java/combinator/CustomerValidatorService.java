package combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
	
	private boolean isEmailValid(String email) {
		return email.contains("@");
	}
	
	private boolean isPhoneNumberValid(String phone) {
		return phone.startsWith("+");
	}
	private boolean isAdult(LocalDate date) {
		return Period.between(date, LocalDate.now()).getYears() >= 18;
	}
	
	public boolean isValid(Customer c) {
		return isEmailValid(c.getEmail())&&isPhoneNumberValid(c.getPhoneNumber())&&isAdult(c.getBirthdate());
	}

}
