import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * @author Tudor Iordan
 */


public class StudentRoster {
	private  int size;
	private Student[] list;
	private int nmbrStudents;
	private boolean isFull = false;
	
	public StudentRoster(){
		size = 5;
		list = new Student[size];
		nmbrStudents = 0;
	}
	public StudentRoster(int size){
		this.size =size;
		list = new Student[size];
		nmbrStudents = 0;
	}
	
	public void addStudent(Student student) {
		if(nmbrStudents < size) {
			list[nmbrStudents]= student;
			nmbrStudents ++;		
		}
		else{
			System.out.println("Roster is full");
		}
	}
	public void findStudent(String name) {
		boolean isFound = false;
		for(int i = 0; i < nmbrStudents; i++) {
			if(list[i].getName().equals(name)) {
				System.out.println(list[i].toString());
				isFound = true;
			}
			if(list[i].getSurname().equals(name)) {
				System.out.println(list[i].toString());
				isFound = true;
			}
			if(list[i].getFullName().equals(name)) {
				System.out.println(list[i].toString());
				isFound = true;
			}
			
		}
		if(!isFound) {
			System.out.println("Student " + name + " is not in the roster.");
		}
		
	}
	
	public void saveToFile() throws FileNotFoundException {
		FileOutputStream fileStream = new FileOutputStream("roster.txt");
		PrintWriter outFS = new PrintWriter(fileStream);
		for(int i = 0; i < nmbrStudents; i++) {
			outFS.println(list[i].getName());
			outFS.println(list[i].getSurname());
			outFS.println(list[i].getGpa());
			outFS.println(list[i].getCurrentAdress());
			outFS.println(list[i].getHomeAdress());
			outFS.println(list[i].getPhoneNumber());
		}
		outFS.close();
	}
	
	public void readFile() throws IOException {
		Scanner inFS = null;
		FileInputStream fileByteStream = new FileInputStream("roster.txt");
		inFS = new Scanner(fileByteStream);
		while(inFS.hasNextLine()) {
			//System.out.println(inFS.next()+" "+inFS.next()+" "+inFS.nextDouble()+" "+inFS.nextLine()+" "+inFS.nextLine()+" "+inFS.nextLine()+" "+inFS.nextLine());
			String name = inFS.next();
			String surname = inFS.next();
			double gpa = inFS.nextDouble();
			inFS.nextLine();
			String currentAdress = inFS.nextLine();
			String homeAdress = inFS.nextLine();
			String phoneNumber = inFS.nextLine();

					
			addStudent(new Student(name, surname, gpa, currentAdress, homeAdress, phoneNumber));
		}
		fileByteStream.close();
	}
	
	public String toString() {
		String className = "";
		for(int i = 0; i < nmbrStudents; i++) {
			className += "\n" + list[i].toString();
		}
		return className;
	}
	/**
	 * @return the isFull
	 */
	public boolean isFull() {
		return isFull;
	}
	/**
	 * @param isFull the isFull to set
	 */
	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the nmbrStudents
	 */
	public int getNmbrStudents() {
		return nmbrStudents;
	}
	/**
	 * @param nmbrStudents the nmbrStudents to set
	 */
	public void setNmbrStudents(int nmbrStudents) {
		this.nmbrStudents = nmbrStudents;
	}
	/**
	 * @return the list
	 */
	public Student[] getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(Student[] list) {
		this.list = list;
	}
	

}
