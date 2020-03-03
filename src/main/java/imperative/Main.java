package imperative;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("John", MALE),
				new Person("Tanja",FEMALE),
				new Person("Sven", MALE),
				new Person("Maria", FEMALE),
				new Person("Sonja", FEMALE)
				);
		
//		Imperative approach:
		System.out.println("Imperative");
		List<Person> females = new ArrayList<>();
		for(Person p : people) {
			if(p.gender.equals(FEMALE)) {
				females.add(p);
			}
		}
		System.out.println(females);
		
//		Declaritive approach:
		System.out.println("Functional");
		people.stream()
			.filter(p -> p.gender.equals(FEMALE))
//			.forEach(p -> System.out.println(p));
			.forEach(System.out::println);
	}
	
	static class Person {
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		
		
		
	}
	
	enum Gender {
		MALE,FEMALE
		
	}

}
