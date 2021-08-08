package entities;

import java.time.LocalDate;
import java.util.Date;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private Date dataOfBirth;
	private String nationalityId;

	public Customer() {

	}

	 

	public Customer(int id, String firstName, String lastName, Date dataOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataOfBirth = dataOfBirth;
		this.nationalityId = nationalityId;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
