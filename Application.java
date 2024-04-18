/**
 * 
 */
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Tudor Iordan
 */
public class Application {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner scnr = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);
		Scanner scnr3 = new Scanner(System.in);
		Scanner scnr4 = new Scanner(System.in);
		Scanner scnr5 = new Scanner(System.in);

		StudentRoster roster;
		String exitValue = "q";
		String input = null;
		String name;
		String surname;
		String phoneNumber;
		String homeAdress;
		String currentAdress;
		String search;
		double gpa;
		int size = 0;
		
		
		//Student student1 = new Student("Tudor", "Iordan", 4.0, "2001 Newbourg Road", "1223 rue du Phare", "+1 438-393-8507");
		//Student student2 = new Student("Victor", "Iordan", 3.2, "20013 Newbourg Road", "1223 rue du Phare", "+1 438-393-8555");

		//roster.addStudents(student1);
		//roster.addStudents(student2);

		//roster.findStudent("Tudor");
		//System.out.println(roster.toString());
		
		System.out.println("Welcome to the Student Roster Builder.");
		System.out.println("Enter the size of the roster (default is 5).");
		
		size = scnr5.nextInt();
		if(size > 0 ) {
			roster = new StudentRoster(size);
		}
		else {
			roster = new StudentRoster();
		}
		
		do {
			System.out.println("\nType the number of the functionality you want to use.");
			System.out.println(menu());
			input = scnr.next();
			if(input.equals("1")) {
				do {
					System.out.println("Enter the first name of the student.");
					name = scnr.next();
					System.out.println("Enter the last name of the student.");
					surname = scnr.next();
					System.out.println("Enter the GPA of the student.");
					gpa = scnr2.nextDouble();
					System.out.println("Enter the current adress of the student.");
					currentAdress = scnr3.nextLine();
					System.out.println("Enter the home adress of the student.");
					homeAdress = scnr3.nextLine();
					System.out.println("Enter the phone number of the student.");
					phoneNumber = scnr3.nextLine();
					System.out.println(new Student(name, surname, gpa, currentAdress, homeAdress, phoneNumber).toString()+"\nIf this information is correct press 'y'.\nIf you want to change the information press 'r'.\nIf you want to go back press 'b'.\nIf you want to quit press 'q'.");
					input = scnr.next();
					
					if(input.equals("y")) {
						roster.addStudent(new Student(name, surname, gpa, currentAdress, homeAdress, phoneNumber));				
					}
				}
				while(!(input.equals("y")||input.equals("b")));
				
							
			}
			else if(input.equals("2")) {
				System.out.println(roster.toString());
			}
			else if(input.equals("3")) {
				System.out.println("Enter the name of the student you want to search for.");
				search = scnr4.nextLine();
				roster.findStudent(search);
				
			}
			else if(input.equals("4")) {
				roster.saveToFile();
			}
			else if(input.equals("5")) {
				roster.readFile();
			}
			else if(input.equals(exitValue)) {
				
			}
			else {
				System.out.println("INVALID OPTION \nTry Again");
				input = scnr.next();
			}			
			

			
		}
		while(!(input.equals(exitValue)));
		System.out.println("Program has been exited");
		
		
	}
	
	public static String menu() {
		return "1. Enter student information for new students\n"
				+ "2. Print the student roster\n"
				+ "3. Enter a student name and search for and print information for a particular student\n"
				+ "4. Save the student roster to disk\n"
				+ "5. Read the student roster from disk\n"
				+ "q. Exit the program\n";
	}
	
	

}
