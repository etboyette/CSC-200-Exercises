
public class Exercise_5_2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("John");
		p1.setAge(34);
		
		Person p2 = new Person();
		p2.setName("Bill");
		p2.setAge(46);
		
		if (p1.getName().equals(p2.getName()) && p1.getAge() == p2.getAge()) {
			System.out.println("Both names and ages are equal.");
		} else {
			System.out.println("The names and ages are not equal.");
		}
		
		if (p1.getName().equals(p2.getName())) {
			System.out.println("The names are the same.");
		} else {
			System.out.println("The names are not the same.");
		}
		
		if (p1.getAge() == p2.getAge()) {
			System.out.println("The ages are the same.");
		} else {
			System.out.println("The ages are not the same.");
		}
		
		if (p1.getAge() >= p2.getAge()) {
			System.out.println(p1.getName() + " is older than " + p2.getName());
		} else {
			System.out.println(p1.getName() + " is younger than " + p2.getName());
		}
	}
	
}