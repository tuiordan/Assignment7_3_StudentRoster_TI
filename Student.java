/**
 * @author Tudor Iordan
 */

public class Student {
	private String name;
	private String surname;
	private double gpa;
	private String currentAdress;
	private String homeAdress;
	private String phoneNumber;
	
	public Student(String name, String surname,double gpa, String currentAdress, String homeAdress, String phoneNumber ) {
		this.setName(name);
		this.setSurname(surname);
		this.setGpa(gpa);
		this.setCurrentAdress(currentAdress);
		this.setHomeAdress(homeAdress);
		this.setPhoneNumber(phoneNumber);
	}
	
	public String toString() {
		return "Full name: " + name + " " + surname 
				+ "\nGPA: " + gpa 
				+ "\nCurrent adress: " + currentAdress 
				+ "\nHome adress: " + homeAdress
				+ "\nPhone number: " + phoneNumber;
	}
	
	public String getFullName() {
		return name + surname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}


	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}


	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}


	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	/**
	 * @return the currentAdress
	 */
	public String getCurrentAdress() {
		return currentAdress;
	}


	/**
	 * @param currentAdress the currentAdress to set
	 */
	public void setCurrentAdress(String currentAdress) {
		this.currentAdress = currentAdress;
	}


	/**
	 * @return the homeAdress
	 */
	public String getHomeAdress() {
		return homeAdress;
	}


	/**
	 * @param homeAdress the homeAdress to set
	 */
	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
