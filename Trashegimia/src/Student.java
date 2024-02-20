/**
 * enum eshte shkurtim i enumerator dhe perdoret per te krijuar nje liste me konstante
 * deklarohet me fjalen kyce enum emriEnumerator{lista e konstanteve te ndara me presje}
 */
enum Status {VITIPARE, VITIDYTE, BACHELOR, MASTER};
public class Student extends Person{
   private Status status; 

/**
 * 
 */
public Student() {
	super();
	
}

/**
 * @param emri
 * @param adrese
 * @param nrTel
 * @param email
 */
public Student(String emri, String adrese, String nrTel, String email, Status status) {
	super(emri, adrese, nrTel, email);
	this.status = status; 
}

/**
 * @return the status
 */
public Status getStatus() {
	return status;
}

/**
 * @param status the status to set
 */
public void setStatus(Status status) {
	this.status = status;
}

@Override
public String toString() {
	
	return String.format("Statusi: %s\n", status.name()) + super.toString();
} 
   
   
}
