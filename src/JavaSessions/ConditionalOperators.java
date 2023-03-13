package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		if(i==j) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(j>=i) {
			System.out.println("j is gr than i");	
		}
		else {
			System.out.println("i is gr than j");
		}
		
		// > >= <= == !=
		
//		int total = 100;
//		if(total != 100) {
//			System.out.println("BYE");
//		}
//		else {
//			System.out.println("Hi");
//		}
		
		//
		int marks = 101;
		if(marks <= 100) {
			System.out.println("valid marks");
			if(marks >= 90) {
				System.out.println("A GRADE");
				if(marks >= 95) {
					System.out.println("eligible for scholarship");
						if(marks == 100) {
							System.out.println("100% fee waived off");
						}
				}
			}
			else {
				if(marks <= 80) {
					System.out.println("B Grade");
				}
			}
		}
		else {
				System.out.println("not a valid mark");
		}
		
		
		
		
	}

}
