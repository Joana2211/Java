
public class Staf extends Punonjes{
       private String titulli;

	/**
	 * 
	 */
	public Staf() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param emri
	 * @param adrese
	 * @param nrTel
	 * @param email
	 * @param zyra
	 * @param paga
	 * @param dataPunesimit
	 */
	public Staf(String emri, String adrese, String nrTel, String email, String zyra, double paga, Data dataPunesimit, String titulli) {
		super(emri, adrese, nrTel, email, zyra, paga, dataPunesimit);
		this.titulli = titulli; 
	}

	/**
	 * @return the titulli
	 */
	public String getTitulli() {
		return titulli;
	}

	/**
	 * @param titulli the titulli to set
	 */
	public void setTitulli(String titulli) {
		this.titulli = titulli;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("Titulli: %s\n", titulli);
	} 
       
       
}
