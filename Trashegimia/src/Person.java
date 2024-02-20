/**
 * Krijojme klasen Person me parametrat e specifikuara ne vazhdim
 * @user Joana
 */
public class Person {
    protected String emri; 
    protected String adrese; 
    protected String nrTel; 
    protected String email;
	/**
	 * @param emri
	 * @param adrese
	 * @param nrTel
	 * @param email
	 */
    /**
     * Konstruktori default pa parametra
     */
    public Person() {
    	
    }
    /**
     * Konstruktori me parametra qe nderton nje objekt te klases Person me parametrat e meposhtme 
     * @param emri
     * @param adrese
     * @param nrTel
     * @param email
     */
	public Person(String emri, String adrese, String nrTel, String email) {
		this.emri = emri;
		this.adrese = adrese;
		this.nrTel = nrTel;
		this.email = email;
	}
	/**
	 * @return the emri
	 */
	public String getEmri() {
		return emri;
	}
	/**
	 * @param emri the emri to set
	 */
	public void setEmri(String emri) {
		this.emri = emri;
	}
	/**
	 * @return the adrese
	 */
	public String getAdrese() {
		return adrese;
	}
	/**
	 * @param adrese the adrese to set
	 */
	public void setAdrese(String adrese) {
		this.adrese = adrese;
	}
	/**
	 * @return the nrTel
	 */
	public String getNrTel() {
		return nrTel;
	}
	/**
	 * @param nrTel the nrTel to set
	 */
	public void setNrTel(String nrTel) {
		this.nrTel = nrTel;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("Emri: %s\nAdresa: %s\nNrTel: %s\nEmail: %s\n", getEmri(), getAdrese(), getNrTel(), getEmail());
	} 
    
    
}
