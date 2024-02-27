package universiteti;

import java.util.ArrayList;
import java.util.List;

/**
 * Student class is used to create a student of university
 * A student has the following information as instance variables 
 * id - unique - type int
 * name - type string
 * feesPaid - type double
 */
public class Student {
     private Integer id;
     private String name;
     private double feesPaid = 0.0;
     static final List<Integer> STUDENTIDLIST = new ArrayList<>();
	/**
	 * @param id
	 * @param name
	 * @param feesPaid
	 */
	public Student(int id, String name) {
		setId(id);
		setName(name);
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		if(id <= 0) throw new IllegalArgumentException("Error, negative ID");
		if(STUDENTIDLIST.contains(id)) throw new 
		IllegalArgumentException("Error, ID" + id+ " exists!");
		else { // good to go
			STUDENTIDLIST.add(id);
		this.id = id;
		}
		
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
	 * @return the feesPaid
	 */
	public double getFeesPaid() {
		return feesPaid;
	}
	/**
	 * @param feesPaid the feesPaid to set
	 */
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	} 
     
     public void payFee(double feesPaid) {
    	 if(feesPaid <= 0 || feesPaid > 5000) {throw new 
    	 IllegalArgumentException("Incorrect fee");
    	 }
    	 this.feesPaid += feesPaid; 
     }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("ID: %d, Name: %s, FeesPaid: %.2f", id, name, feesPaid);
	}
     
}
